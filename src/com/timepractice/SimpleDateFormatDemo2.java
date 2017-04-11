package com.timepractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {

	public static void main(String[] args) {
		Date d = new Date();
		// ���췽��,������ʱ���ʽ.
		//HH��24Сʱ��,hh��12Сʱ��
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		System.out.println(sd); // java.text.SimpleDateFormat@5b90f5a0
		System.out.println(sd.format(d)); //2016-12-14 04:48:38
		String res1 = sd.format(d.getTime()); // ���ʱ��
		System.out.println(res1); // 2016-12-14 04:48:38
		String res2 = sd.format(new Date()); // ʹ���������
		System.out.println(res2); // 2016-12-14 04:48:38

	}

}
