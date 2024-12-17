package introduction;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class corejava2 {

	public static void main(String[] args) {
		int[] arr2={1,2,3,4,5,6,7,8,9};
		//check multiples of 2
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
			{ 
				System.out.println(arr2[i]);
				break;//exit loop
				
			
			}
			else
			{
				System.out.println(arr2[i]+"is anot a multiple of 2");
			}
				
		}
           //Arraylist
	     ArrayList<String> a=new ArrayList<String>();               //arraylist is used to give the values dynamically
	     a.add("rahul");//object is created to access the methods
	     a.add("pooja");
	     a.add("Selenium");
	     a.remove(2);
	     System.out.println(a.get(1) );
	     for (int i=0;i<a.size();i++)
	     {
	    	 System.out.println(a.get(i));
	    	 
	    	
	     }
	     
	}
	

}
