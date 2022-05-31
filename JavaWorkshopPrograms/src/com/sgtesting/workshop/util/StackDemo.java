package com.sgtesting.workshop.util;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st=new Stack();
		pushElements(st, 100);
		pushElements(st, 200);
		pushElements(st, 300);
		pushElements(st, 400);
		pushElements(st, 500);
		popElement(st);
		popElement(st);
	}
	
	static void pushElements(Stack st,int a)
	{
		st.push(a);
		System.out.println(a);
	}
	
	static void popElement(Stack st)
	{
		int b=(int) st.pop();
		System.out.println("Removed Eleemnt:"+b);
	}

}
