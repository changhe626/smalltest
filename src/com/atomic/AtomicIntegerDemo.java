package com.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

	public static void main(String[] args) {
		AtomicInteger  a=new AtomicInteger(6) ;
		System.out.println(a.get());
		
	}

}
