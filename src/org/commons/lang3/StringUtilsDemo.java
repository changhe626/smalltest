package org.commons.lang3;



import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsDemo {

	public static void main(String[] args) {
		//判断是否为空的字符串
	   //StringUtils.isBlank(null)      = true
	    // StringUtils.isBlank("")        = true
	    // StringUtils.isBlank(" ")       = true
/*		boolean blank = StringUtils.isBlank(" v ");
		System.out.println(blank);*/
		
		
		//字符串的截取,包含从指定的下表开始作为字一个截取
		//String truncate = StringUtils.truncate("zhangke", 2, 3);
		//System.out.println(truncate);  ang
		
		//对空格的去除
		//System.out.println(StringUtils.strip("  v  "));  v
		//System.out.println(StringUtils.strip(" ds  d  "));  ds  d
		
		
		//第一次出现的下标,从0 开始,找不到返回-1
		//System.out.println(StringUtils.indexOf("dsadsa", "d"));  //0
		//System.out.println(StringUtils.indexOf("dsadsa", "sf"));
		
		//替换出现的第一次
		System.out.println(StringUtils.replaceOnce("dsa", "a", "zz"));
		//全部替换
		System.out.println(StringUtils.replace("sadas", "a", "z"));
		
		
		
		
		
	}

}
