package testprog;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Javastream {

	// TODO Auto-generated method stub

		
		@Test
		public void regular()
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("Anu");
			names.add("Suma");
			names.add("Avni");
			names.add("Anvesh");
			names.add("Ram");
			int count=0;
			for(int i=0;i<names.size();i++)
			{
				String actual=names.get(i);
				if(actual.startsWith("A"))
				{
					count++;
					
				}
			}
			System.out.println(count);
		}

}
