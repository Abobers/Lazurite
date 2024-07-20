package com.kingmang.lazurite.patterns.visitor

import com.kingmang.lazurite.parser.ast.expressions.*
import com.kingmang.lazurite.parser.ast.statements.*

interface Visitor {
    fun visit(s: AssertStatement)
    fun visit(s: TryCatchStatement)
    fun visit(s: ArrayExpression)
    fun visit(s: AssignmentExpression)
    fun visit(s: BinaryExpression)
    fun visit(s: BlockStatement)
    fun visit(s: BreakStatement)
    fun visit(s: ClassDeclarationStatement)
    fun visit(s: ConditionalExpression)
    fun visit(s: ContainerAccessExpression)
    fun visit(s: ContinueStatement)
    fun visit(s: DestructuringAssignmentStatement)
    fun visit(s: ForStatement)
    fun visit(s: ForeachAStatement)
    fun visit(s: ForeachMStatement)
    fun visit(s: FunctionDefineStatement)
    fun visit(e: FunctionReferenceExpression)
    fun visit(s: ExprStatement)
    fun visit(s: FunctionalExpression)
    fun visit(s: IfStatement)
    fun visit(s: MapExpression)
    fun visit(s: MatchExpression)
    fun visit(s: ObjectCreationExpression)
    fun visit(s: PrintStatement)
    fun visit(s: PrintlnStatement)
    fun visit(s: ReturnStatement)
    fun visit(s: TernaryExpression)
    fun visit(s: UnaryExpression)
    fun visit(s: ValueExpression)
    fun visit(s: VariableExpression)
    fun visit(st: WhileStatement)
    fun visit(st: UsingStatement)
}
