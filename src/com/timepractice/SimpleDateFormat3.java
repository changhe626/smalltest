package com.timepractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat3 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s="2015-2-2 13:22:9"; 
		// String s="2015:2:2 13:22:9";  д������ͻ�ת���쳣��
		Date res=sd.parse(s);   //��ת���쳣,���ַ�ת��������
		System.out.println(res);   //Thu Feb 05 03:02:09 CST 2015
		String res2=sd.format(res);   //ת����ʽ
		System.out.println(res2);  //2015-02-05 03:02:09
		
		/*//һЩ������ʾ,������������!! hhΪ12Сʱ��.
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s="2015-12-32 13:22:99";
		Date res=sd.parse(s); 
		System.out.println(res);   //Fri Jan 01 13:23:39 CST 2016
		String res2=sd.format(res);   //ת����ʽ
		System.out.println(res2);  //2016-01-01 01:23:39
		//�Զ�ʱ���ʽת��.31��,����ǰ��λ��,����2016��1����,��Ҳ����Ͻ�λ��
		*/
		
		
	}

}
