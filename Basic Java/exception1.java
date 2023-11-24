public class exception1 {
	public static void main(String[] args)
	{
		int num1=6;
		int num2=2;
		int result=0;
		int values[]={4,7,2,9};

		try
		{
			result=num1/num2;
			System.out.println(values[7]);
		}

		catch(Exception e)
		{
			System.out.println("You cannot divide the number by Zero" + e);
		}
		System.out.println(result);
		System.out.println("Bye");
	}
}


// Output: You cannot divide the number by Zero java.lang.ArrayIndexOutOfBoundsException: Index 7 out
//	  of bounds for length 4
//	  3
//	  Bye