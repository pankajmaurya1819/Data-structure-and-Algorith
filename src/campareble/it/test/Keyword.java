package campareble.it.test;

public class Keyword {
	int age=50;
	String name="sanjay";
	void m1()
	{
		System.out.println(this.age);
	}
	void m2()
	{
		this.m1();
		System.out.println("welcome in your house");
	}
	
public static void main(String[] args) {
	Keyword ke=new Keyword();
	ke.m2();
	
}
}
