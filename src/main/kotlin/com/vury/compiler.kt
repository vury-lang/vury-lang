package com.vury

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun compile(str: String){
    val lexer = vuryLexer(CharStreams.fromString(str))
    val parser: vuryParser = vuryParser(CommonTokenStream(lexer))
    val ruleCtx: ParserRuleContext = parser.comp
    val listener = object : vuryBaseListener() {
        override fun enterFile(ctx: vuryParser.FileContext?) {
            super.enterFile(ctx)
            println("OWO! FILE")
            ctx!!.children.joinToString(", ")
        }
    }
    val ruleWalker = ParseTreeWalker()
    ruleWalker.walk(listener, ruleCtx)
}