package introduction;

public class corejava1 {

	public static void main(String[] args)
	{
	
		int mynum=5;
		String website="Rahulshetty academy";
		char letter='c';
		double dec=5.99;
		boolean mycard=true;
		
		System.out.println(mynum+"is the value stored in the mynum variable");
		System.out.println("website");
		int[] arr =new int[5]; //syntax for array
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		
		//2nd method
		int[] arr2={1,2,3,4,5,6,7,8,9};
		System.out.println(arr2[2]);  

		//for loop:arr.lenghth=5

		
     /*   for(int i=0;i<arr2.length;i++)
     {
	        System.out.println(arr2[i]);
        }
     //3rd method
              String[] name= {"pooja","rahul","sam"};
              for(int i=0;i<name.length;i++)
              {
            	  System.out.println(name[i]);
              }*/
		// 4rth enhanced for loop
		 String[] name= {"pooja","rahul","sam"};
              for (String s:name)
              {
              System.out.println(s);
              }


	}

}
