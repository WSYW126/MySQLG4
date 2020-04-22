// Generated from /Users/yangjunpeng/Documents/project/MySQLG4/antlr/Statements.g4 by ANTLR 4.7.2
package cc.wsyw126.MySQLG4.auto;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StatementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StatementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code selectcl}
	 * labeled alternative in {@link StatementsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectcl(StatementsParser.SelectclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code countcl}
	 * labeled alternative in {@link StatementsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountcl(StatementsParser.CountclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertcl}
	 * labeled alternative in {@link StatementsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertcl(StatementsParser.InsertclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deletecl}
	 * labeled alternative in {@link StatementsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletecl(StatementsParser.DeleteclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#insertc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertc(StatementsParser.InsertcContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#selectc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectc(StatementsParser.SelectcContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#deletec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletec(StatementsParser.DeletecContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#countc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountc(StatementsParser.CountcContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#wherec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWherec(StatementsParser.WherecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequalvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalvar(StatementsParser.NotequalvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessequalvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessequalvar(StatementsParser.LessequalvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notbetweenvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotbetweenvar(StatementsParser.NotbetweenvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andcondition}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndcondition(StatementsParser.AndconditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterequalconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterequalconstant(StatementsParser.GreaterequalconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualvar(StatementsParser.EqualvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterconstant(StatementsParser.GreaterconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenvar(StatementsParser.BetweenvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenconstant(StatementsParser.BetweenconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isnotnullc}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsnotnullc(StatementsParser.IsnotnullcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inconstantlist}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInconstantlist(StatementsParser.InconstantlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notbetweenconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotbetweenconstant(StatementsParser.NotbetweenconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notinconstantlist}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotinconstantlist(StatementsParser.NotinconstantlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orcondition}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrcondition(StatementsParser.OrconditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isnullc}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsnullc(StatementsParser.IsnullcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualconstant(StatementsParser.EqualconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterequalvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterequalvar(StatementsParser.GreaterequalvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessvar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessvar(StatementsParser.LessvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequalconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalconstant(StatementsParser.NotequalconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invarlist}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvarlist(StatementsParser.InvarlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessconstant(StatementsParser.LessconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionwrapper}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionwrapper(StatementsParser.ConditionwrapperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notinvarlist}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotinvarlist(StatementsParser.NotinvarlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessequalconstant}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessequalconstant(StatementsParser.LessequalconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greatervar}
	 * labeled alternative in {@link StatementsParser#conditionc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreatervar(StatementsParser.GreatervarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cidList_CidList}
	 * labeled alternative in {@link StatementsParser#selectCidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidList_CidList(StatementsParser.CidList_CidListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cidList_Star}
	 * labeled alternative in {@link StatementsParser#selectCidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidList_Star(StatementsParser.CidList_StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cidList_Regx}
	 * labeled alternative in {@link StatementsParser#selectCidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidList_Regx(StatementsParser.CidList_RegxContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#cidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidList(StatementsParser.CidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#cid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCid(StatementsParser.CidContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(StatementsParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#constant2List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant2List(StatementsParser.Constant2ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#constant3List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant3List(StatementsParser.Constant3ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant2_NotNull}
	 * labeled alternative in {@link StatementsParser#constant2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant2_NotNull(StatementsParser.Constant2_NotNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant2_Null}
	 * labeled alternative in {@link StatementsParser#constant2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant2_Null(StatementsParser.Constant2_NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#limitexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitexp(StatementsParser.LimitexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#tablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(StatementsParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(StatementsParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementsParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(StatementsParser.VarContext ctx);
}