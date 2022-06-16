import java.util.Scanner;
class mu extends Thread
{
	int n;
	public void run()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit for multiplication : ");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{

	System.out.println(i+"*5="+(i*5));

	}
	}
}
class pr extends Thread{

	public void run()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit for prime : ");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int f=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					f++;				}
			}
			if(f==2)
			{
				System.out.println(" "+i);
			}
		}
	}
}
public class th1
{
	public static void main(String args[])
	{
	mu m=new mu();
	pr p=new pr();
	m.start();
	p.start();
	
	}
}