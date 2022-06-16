import java.util.Scanner;
class ex extends Exception
{
	public ex(String s)
	{
	super(s);
	}
}
class valid
{
	public void get() throws ex
	{
		int n;
		int sum=0;
		float avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
		if(a<0)
		{
			throw new ex("Entered Negative Number");

		}
		else
		{
			sum=sum+a;
			avg=sum/n;
		
		}
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);		

	}
}
class negat
{
	public static void main(String args[])
	{
		valid v=new valid();
		try{

			v.get();
		}
		catch(ex e)
		{
			System.out.println("Exception::::::"+e);
		}
	}
}