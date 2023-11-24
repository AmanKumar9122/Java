import java.util.Scanner;
public class exception3
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);

		try
		{
			num=sc.nextInt();
		}

		catch(InputMismatchException e)
		{
			System.out.println("Please enter number");
		}
		sc.close();
	
		System.out.println(num);
		
	}
}