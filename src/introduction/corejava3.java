package introduction;

public class corejava3 {

	public static void main(String[] args) {
		//string is an object that represents sequence of characters
		String s5="Rahul shetty";
		String s1="Rahul shetty";
		
		//we can define string in 2 ways
		//1.string literals
		//2.using new operator
		//difference: in string literals basically if they have same multiple values 
		//then the value will be stored in the existing variable will not store in the new variable
		// but in 2 nd method no matter if they same value but still explicitly  create new memory 
		//location for the value
		
		//
		String s2=new String("welcome");
		String s3=new String("welcome");
		
		String S=("Rahul shetty academy");
		String[] splittedString = S.split("shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
	   System.out.println(splittedString[1].trim());
	   
	   for(int i=0;i<S.length();i++)
	   {
		 System.out.println(S.charAt(i));//print character by character
		   
	   }
	   //reverse order cahracters
		for(int i=S.length()-1;i>=0;i--)
		{
			System.out.println(S.charAt(i));
		}
	}

}
