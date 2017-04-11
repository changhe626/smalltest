package com.changhe;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
	//	System.out.println(s.peek());
		//空的话,会报错Exception in thread "main" java.util.EmptyStackException
		s.push("caocao");
		System.out.println(s.pop());
		//System.out.println(s.pop());//没有值了就报错Exception in thread "main" java.util.EmptyStackException
		
		
	}

}
