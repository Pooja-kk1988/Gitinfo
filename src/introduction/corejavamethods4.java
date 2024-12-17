package introduction;

public class corejavamethods4 {

	public static void main(String[] args) {
		corejavamethods4 c=new corejavamethods4();
		String name=c.getData();//if we use static ,then we can call directly like String name=getData();
		System.out.println(name);
		getData1();
		

	}
	// we cannot create a method in the main class,it will throw an error
public String getData()
{
	System.out.println("welcome");
	return "Rahul shetty";
	
}


public static String getData1()//when we mark a method as static it belongs to the class so no need to create object to call the methods
{
	System.out.println("welcome");
	return "Academy";
	
}
}
