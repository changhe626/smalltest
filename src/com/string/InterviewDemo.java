package com.string;

public class InterviewDemo {

	//123变成一百二十三  1234 一千二百三十四
	public static void main(String[] args) {
		String str="3213";
		String[] value={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (int i=1; i <=charArray.length; i++) {
			int index = Integer.parseInt(charArray[i-1]+"");
			sb.append(value[index]);
			if((charArray.length-i)==3){
				sb.append("千");
			}
			if((charArray.length-i)==2){
				sb.append("佰");
			}
			if((charArray.length-i)==1){
				sb.append("拾");
			}
		}
		System.out.println(sb.toString());
	}

}
