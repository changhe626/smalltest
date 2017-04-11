package com.timepractice;

import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		//���Ȼ�ȡ����
		Calendar c=Calendar.getInstance();
		
		/*//һ������ʱ��
		c.set(2000,5, 30);
		//��ȡʱ��
		int y=c.get(Calendar.YEAR);
		int m=c.get(Calendar.MONTH);
		int d=c.get(Calendar.DAY_OF_MONTH);
		//��ӡ����
		System.out.println("year:"+y+",mouth:"+m+",day:"+d);   //year:2000,mouth:5,day:30
		*/
		
		//����ʱ��
		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.DAY_OF_MONTH, 20);
		//��ȡʱ��
		int y=c.get(Calendar.YEAR);
		int m=c.get(Calendar.MONTH);
		int d=c.get(Calendar.DAY_OF_MONTH);
		//��ӡ����
		System.out.println("year:"+y+",mouth:"+m+",day:"+d);   //year:2013,mouth:6,day:20
	
		}

}
