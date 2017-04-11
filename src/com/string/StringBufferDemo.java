package com.string;


public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("����һ,һ���,������,��������");
		StringBuffer sb1=sb.reverse();
		System.out.println(sb); //��������,�����,����һ,һ���
		System.out.println(sb1);//��������,�����,����һ,һ���
	}
}
