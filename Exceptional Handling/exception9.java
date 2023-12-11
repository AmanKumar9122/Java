class MyException extends Exception
{
	public MyException(){
 	
	}
	public MyException(String msg)
	{
		super(msg);
	}
}
	
public class exception9
{
	public static void main(String args[])
	{
	int num1 = 6;
	int num2 = -2;
	try{
		if(num2 < 0){
			throw new MyException("Negative Number");
		}
		else
		{
			int result=num1 / num2;
			System.out.println(result);
		}
	}
	catch(Exception e)
	{
		System.out.println("Enter a valid number");
	}
	}
}