package com.zc.l15interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        String context = "Name1 Name3";
        Expression define = buildInterpreterTree();
        System.out.println(define.interpret(context));
    }

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Name1" );
        Expression terminal2 = new TerminalExpression("Name2" );
        Expression terminal3 = new TerminalExpression("Name3" );
        Expression terminal4 = new TerminalExpression("Name4" );
        //Name1或Name3
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        //Name1或Name2或Name3
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        //Name1和(Name2或(Name3或Name4))
        return new AndExpression(terminal4, alternation2);
    }
}
