package com.changhe;

public class ObjectDefaultValueDemo {

	public static void main(String[] args) {
		//表明了使用Integer 和int来定义数据类型的时候在堆区中的初始值是不一样的
		//只要是包装类型的默认是就会是null，但是定义的int类型的还是null
		System.out.println(new User1());
		System.out.println(new User2());
	}

}
class User2 {
	private int age;
	private String name;
	private boolean flag;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "User2 [age=" + age + ", name=" + name + ", flag=" + flag + "]";
	}
	
}



class User1 {
	private Integer age;
	private String name;
	private Boolean flag;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "User1 [age=" + age + ", name=" + name + ", flag=" + flag + "]";
	}
	
}