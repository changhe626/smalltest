package com.timepractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat();      //Ĭ��ʱ���ʽ
		System.out.println(sdf);        //java.text.SimpleDateFormat@b5341f2a   �ڴ��ַ
		System.out.println(sdf.format(d));        //16-12-14 ����4:44        �˿�ʱ��

	}

}
