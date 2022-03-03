grammar vury;

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
DOLLAR_T: '$';
LCURLY_T: '{';
RCURLY_T: '}';
COMMA_T: ',';
DOT_T: '.';
VARIABLE_T: 'variable';
IDENTIFIABLE_T: [a-zA-Z0-9_]+ | LQUOTE_T .*? LQUOTE_T;
STRING: DQUOTE_T (.*? | DOLLAR_T IDENTIFIABLE_T)*? DQUOTE_T;
WS_T: [\n\r ] -> skip;

valueT: STRING;
variableDeclarationT: VARIABLE_T IDENTIFIABLE_T (ASSIGN_T valueT);
scopedStatementT: variableDeclarationT;
topLevelStatementT: variableDeclarationT;
compilationUnit: topLevelStatementT* EOF;