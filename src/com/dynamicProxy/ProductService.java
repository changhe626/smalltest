package com.dynamicProxy;
public class ProductService {
	public void save(){
		System.out.println("业务层产品保存。。");
	}
	
	public int queryCount(){
		System.out.println("业务层产品查询。。");
		return 10;
	}
}