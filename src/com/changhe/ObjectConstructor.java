package com.changhe;


public class ObjectConstructor  {
	public static void main(String[] args) {
		new Cat();
		//结果是:
		/*动物的构造方法
		猫的构造方法*/
	}

}


class  Animal{
	public Animal() {
		super();
		System.out.println("动物的构造方法");
	}
}

class Cat extends Animal{

	public Cat() {
		System.out.println("猫的构造方法");
	}
	
}