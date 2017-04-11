package com.dynamicProxy;

public class CustomerService {
	public void save(){
		System.out.println("用户信息已经保存了");
	}
	public int find(){
		System.out.println("用户的编号已经找到了");
		return  4;
	}

}
