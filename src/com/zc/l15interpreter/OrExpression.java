package com.zc.l15interpreter;

//或表达式
public class OrExpression extends Expression {
    private Expression exp1 = null;

    private Expression exp2 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String str) {
        return exp1.interpret(str) || exp2.interpret(str);
    }

}
