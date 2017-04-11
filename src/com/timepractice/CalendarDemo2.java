package com.timepractice;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {

	public static void main(String[] args) {
		//���һ������Ķ���
		Calendar c=Calendar.getInstance();
			//System.out.println(c);  //java.util.GregorianCalendar[time=1481703045212,areFieldsSet=true
			int y=c.get(Calendar.YEAR);
			int m=c.get(Calendar.MONTH);
			int d=c.get(Calendar.DAY_OF_MONTH);
			//��Ϊ�·��Ǵ�0��ʼ�����,����Ҫ��ǰʱ���·ݱ����ڴ�ӡ��ʱ�����һ
			System.out.println("year:"+y+",mouth:"+(m+1)+",day:"+d);   //year:2016,mouth:12,day:14
	}

}
