package newProgs;

public class PC extends Ps3 {
	
	
	int a;//class variable
	
	public PC(int a)// here"a" is an instance variable, scope is within this block

	 {
		super(a);// parent class  constructor is invoked
		// super keyword can only be used when inheritance is in place
		//rule:super keyword should be written at first in the constructor
       this.a=a;//this keyword refers to the class variable
	}

	


	public int increment()
	{
		a=a+1;
		return a;

	}
	
	
	

	public int decrement()
	{
		a=a-1;
		return a;
	}


	
}
