package com.changhe;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		/*Random r=new Random();
		for(int i=0;i<10;i++){
			System.out.println(r.nextInt()); //-1426027480  439913772	
		}*/
		Random r2=new Random(10);  //设置种子就得到一样的随机数了
		for(int i=0;i<10;i++){
			System.out.println(r2.nextInt(10)); //  产生的10个随机数就是一样的
		}
		
	}

}
