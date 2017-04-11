package com.copyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {

	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("曹操");
		list.add(21);
		
		System.out.println(list);
		System.out.println(list.get(1));
		

	}

}
