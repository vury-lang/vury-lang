package com.vury;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link vuryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface vuryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link vuryParser#callArgsDefT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgsDefT(vuryParser.CallArgsDefTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#callArgsT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgsT(vuryParser.CallArgsTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#operatorT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorT(vuryParser.OperatorTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#expressionT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionT(vuryParser.ExpressionTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#variableT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableT(vuryParser.VariableTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#functionT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionT(vuryParser.FunctionTContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(vuryParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vuryParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(vuryParser.FileContext ctx);
}