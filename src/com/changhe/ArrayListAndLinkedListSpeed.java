package com.changhe;

import java.util.ArrayList;
import java.util.LinkedList;
//ArrayList和LinkedList速度的对比

public class ArrayListAndLinkedListSpeed {

	@SuppressWarnings("all")
	public static void main(String[] args) {
			 long start = System.currentTimeMillis();
			 ArrayList list = new ArrayList();
			 Object obj = new Object();
			 for(int i=0;i<5000000;i++){
			 list.add(obj);
			 }
			 long end = System.currentTimeMillis();
			 System.out.println(end-start);

			 start = System.currentTimeMillis();
			 LinkedList list1 = new LinkedList();
			 Object obj1 = new Object();
			 for(int i=0;i<5000000;i++){
			 list1.add(obj1);
			 }
			 end = System.currentTimeMillis();
			 System.out.println(end-start);

			 start = System.currentTimeMillis();
			 Object obj2 = new Object();
			 for(int i=0;i<1000;i++){
			 list.add(0,obj2);
			 }
			 end = System.currentTimeMillis();
			 System.out.println(end-start);

			 start = System.currentTimeMillis();
			 Object obj3 = new Object();
			 for(int i=0;i<1000;i++){
			 list1.add(obj1);
			 }
			 end = System.currentTimeMillis();
			 System.out.println(end-start);

			 start = System.currentTimeMillis();
			 list.remove(0);
			 end = System.currentTimeMillis();
			 System.out.println(end-start);

			 start = System.currentTimeMillis();
			 list1.remove(250000);
			 end = System.currentTimeMillis();
			 System.out.println(end-start);

		
			
		
	}
}

