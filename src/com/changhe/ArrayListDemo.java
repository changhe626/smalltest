package com.changhe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args){
		List<String> ar =new ArrayList<>();
		
	//	ar.add("56");
/*		String res= ar.get(0);
		System.out.println(res);*/
		
		
	/*	ar.add("43");
		ar.add("24");
		ar.add("20");
		System.out.println(ar);
		System.out.println(ar.toString());
		StringBuffer sb2=new StringBuffer();
		for (String string : ar) {
			sb2.append(",").append(string);
		}
		System.out.println(sb2.substring(1));*/
		
		//判断空的list是否等于null  ,这是个空的list
		System.out.println(ar.isEmpty());   //true
		System.out.println(ar==null);  //false
		  
	}
	
}
