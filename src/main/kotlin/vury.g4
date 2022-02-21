grammar vury;

fragment ESCAPE_F: LQUOTE_T .*? LQUOTE_T;
fragment IDENTIFIABLE_F: [a-zA-Z0-9_];
fragment DIGIT_F: [0-9];
ASSIGN_T: '=';
EQUALS_T: '==';
SEMICOLON_T: ';';
COLON_T: ':';
SQUOTE_T: '\'';
DQUOTE_T: '"';
LQUOTE_T: '`';
PLUS_T: '+';
MINUS_T: '-';
LPAREN_T: '(';
RPAREN_T: ')';
LCURLY_T: '{';
RCURLY_T: '}';
COMMA_T: ',';
VALUE_T: INTEGER_T | STRING_T;
IDENTIFIABLE_T: IDENTIFIABLE_F+ | ESCAPE_F+;
STRING_T: DQUOTE_T .*? DQUOTE_T;
INTEGER_T: DIGIT_F+;
WS_T: [\n\r ] -> skip;

callArgsDefT: LPAREN_T(IDENTIFIABLE_T(COLON_T IDENTIFIABLE_T)?(COMMA_T IDENTIFIABLE_T(COLON_T IDENTIFIABLE_T)?)*)?RPAREN_T;
callArgsT: LPAREN_T(expressionT(COMMA_T expressionT)*)?RPAREN_T;
operatorT: PLUS_T | MINUS_T;
expressionT
    : VALUE_T
    | IDENTIFIABLE_T callArgsT?
    | expressionT operatorT VALUE_T
    | expressionT operatorT LPAREN_T expressionT RPAREN_T
    | LPAREN_T expressionT RPAREN_T operatorT expressionT;
variableT: 'variable' IDENTIFIABLE_T (ASSIGN_T expressionT)?;
functionT: 'function' IDENTIFIABLE_T (callArgsDefT)? (COLON_T IDENTIFIABLE_T)? LCURLY_T statement* RCURLY_T;
statement: (variableT | expressionT | functionT) (SEMICOLON_T statement?)?;
file: statement*;
