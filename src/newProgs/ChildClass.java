package newProgs;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void testRun()
	{
		
		//If we didnt use Inheritance the we can call another class by creating its object
		//ParentClass pc=new ParentClass();
		//pc.dothis();
		PC con=new PC(3);//parameterized constructor
		//int a=3;
		dothis();
		System.out.println(con.increment());
		System.out.println(con.decrement());
		
		//Ps3 ps3=new Ps3(3);
		System.out.println(con.multiplythree());
	}

}
