package com.string;

public class FunctionInvokeDemo {

	public static void main(String[] args) {
		getSum1();
		
	//	getSum2();
	/*	System.out.println(Integer.MAX_VALUE);  //2147483647 -8
																		//268435456
*/		
		
	}

	private static void getSum2() {
		String s="b";
		for(int i=0;i<100;i++){
			s=s+i;
		}
		System.out.println(s);
	}

	private static void getSum1() {
		String s="b";
		for(int i=0;i<100;i++){
			System.out.println(i+"\t"+"s.length"+s.length());
			s=s+s;
		}
		System.out.println(s);
	}
}
