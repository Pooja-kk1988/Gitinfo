package newProgs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {

	//How many methods we write in parent class all will be executed first and the which method id called in child class along with that 
		public void dothis()
		{
            System.out.println("I am here");
	}

		@BeforeMethod
		public void beforerun()
		{
			System.out.println("Run me first");
			
		}
		
		
		@AfterMethod
		public void afterrun()
		{
			System.out.println("Run me last");
			
		}
		
		
		
}


