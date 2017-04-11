package com.changhe;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		try{
			System.out.println(1/0);
			
		}catch(Exception e){
			System.out.println("catch");
			System.out.println("xxx");
			
		}finally{
			System.out.println("finally");
		}
		System.out.println("thelast");
		
	}

}
 