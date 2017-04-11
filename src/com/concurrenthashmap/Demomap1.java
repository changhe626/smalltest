package com.concurrenthashmap;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
@SuppressWarnings("all")
public class Demomap1 {
	public static void main(String[] args) {
		ConcurrentHashMap map = new ConcurrentHashMap();
	//	System.out.println(map.isEmpty());
	//	System.out.println(map.size());
		map.put("name", "曹操");
		Object object = map.get("name");
/*		System.out.println(object);
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsValue("cao"));*/
		/*Object remove = map.remove("sa");
		System.out.println(remove);*/
		map.replace("name", "刘备");
		System.out.println(map);
		
		Enumeration elements = map.elements();
		
		System.out.println(elements);
		
	}
}
