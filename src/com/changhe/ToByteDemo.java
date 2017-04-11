package com.changhe;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ToByteDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/*String s="昂首千秋远，笑傲风间，看寻敌手共论剑，高处不胜寒";
		byte[] bytes = s.getBytes();
		byte[] b=new byte[1024];
		b=s.getBytes("utf-8");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}*/
		
/*		double d1=3.5D;
		double d2=5.500D;
		System.out.println(d1==d2);  //false
*/		
/*		Double d1=4.5D;
		Double d2=4.500D;
		Double[] d3={d1};
		Double[] d4={d2};
		System.out.println(d1==d2);  //false
		System.out.println(Double.doubleToLongBits(d1));
		System.out.println(Double.doubleToLongBits(d2));
		boolean b = Arrays.equals(d3, d4);
		System.out.println(b);  //true
*/		
		
/*		Double d1=0D;
		Double d2=0.0D;
		System.out.println(d1==d2);  //false
		int compare = Double.compare(d1, d2);
		System.out.println(compare);  //0
		Double[] d3={d1};
		Double[] d4={d2};
		System.out.println(d3==d4);  //false
		System.out.println(Arrays.equals(d3, d4));   //true
*/		
		System.out.println(0.0d==-0.0d);   //true
		System.out.println(0.0f==-0.000f);    //true
		
		
		
		
	}
	

}
