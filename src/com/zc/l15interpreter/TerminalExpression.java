package com.zc.l15interpreter;
import java.util.StringTokenizer;

//终结符表达式类,只有一个终结符表达式类,若它发现了终结符标记,就返回true
public class TerminalExpression extends Expression {
	private String literal=null;
	public TerminalExpression(String str){
		literal=str;
	}
	@Override
	public boolean interpret(String str) {
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()){
			String test=st.nextToken();
			if(test.equals(literal)){
				return true;
			}
		}
		return false;
	}

}
