import java.util.Scanner;
public class exception4
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);

		try
		{
			num=sc.nextInt();
		}

		finally
		{
		sc.close();
		System.out.println("Resources Closed");
		}

		System.out.println(num);
		
	}
}
