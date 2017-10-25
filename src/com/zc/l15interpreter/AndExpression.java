package com.zc.l15interpreter;
//与 表达式
public class AndExpression extends Expression{
	private Expression exp1=null;
	private Expression exp2=null;
	public AndExpression(Expression exp1,Expression exp2){
		this.exp1=exp1;
		this.exp2=exp2;
	}
	@Override
	public boolean interpret(String str) {
		return exp1.interpret(str)&&exp2.interpret(str);
	}
}
