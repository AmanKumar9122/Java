class Calc
{
	public int add(int n1, int n2)
	{
		int result=n1+n2;
		return result;
	}
}
public class classobj {
public static void main(String[] agrs){

	Calc obj=new Calc();
	int result=obj.add(4,3);
	System.out.println(result);
	}
}

