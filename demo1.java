package javaexamples;

public class demo1 {
	public int age;
	public String name;
	public void setage(int age)
	{
		this.age=age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		demo1 kashif = new demo1();
		demo1 faiz = new demo1();
		faiz.setage(21);
		kashif.setage(22);
		System.out.println("faiz age ="+faiz.age);
		System.out.println("kashif age ="+kashif.age);
		faiz.setname("rock");
		kashif.setname("star");
		System.out.println("faiz nick name="+faiz.name);
		System.out.println("kashif nick name="+kashif.name);
	}

}
