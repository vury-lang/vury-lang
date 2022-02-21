// Generated from C:/Users/alexe/IdeaProjects/vury-lang/src/main/kotlin\vury.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vuryParser}.
 */
public interface vuryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vuryParser#callArgsDefT}.
	 * @param ctx the parse tree
	 */
	void enterCallArgsDefT(vuryParser.CallArgsDefTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#callArgsDefT}.
	 * @param ctx the parse tree
	 */
	void exitCallArgsDefT(vuryParser.CallArgsDefTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#callArgsT}.
	 * @param ctx the parse tree
	 */
	void enterCallArgsT(vuryParser.CallArgsTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#callArgsT}.
	 * @param ctx the parse tree
	 */
	void exitCallArgsT(vuryParser.CallArgsTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#operatorT}.
	 * @param ctx the parse tree
	 */
	void enterOperatorT(vuryParser.OperatorTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#operatorT}.
	 * @param ctx the parse tree
	 */
	void exitOperatorT(vuryParser.OperatorTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#expressionT}.
	 * @param ctx the parse tree
	 */
	void enterExpressionT(vuryParser.ExpressionTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#expressionT}.
	 * @param ctx the parse tree
	 */
	void exitExpressionT(vuryParser.ExpressionTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#variableT}.
	 * @param ctx the parse tree
	 */
	void enterVariableT(vuryParser.VariableTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#variableT}.
	 * @param ctx the parse tree
	 */
	void exitVariableT(vuryParser.VariableTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#functionT}.
	 * @param ctx the parse tree
	 */
	void enterFunctionT(vuryParser.FunctionTContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#functionT}.
	 * @param ctx the parse tree
	 */
	void exitFunctionT(vuryParser.FunctionTContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(vuryParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(vuryParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vuryParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(vuryParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link vuryParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(vuryParser.FileContext ctx);
}