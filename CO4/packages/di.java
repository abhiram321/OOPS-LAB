package arith;
import java.util.Scanner;
public class di implements ar
{
	public void result()
	{
		int a,b;
		System.out.println("Enter a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		float r=a/b;
		System.out.println("Result= "+r);

	}
}