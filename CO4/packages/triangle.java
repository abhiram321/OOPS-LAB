package graphics;
import java.util.Scanner;

public class triangle implements ap
{
	Scanner sc=new Scanner(System.in);
	int b,h;
	public void read()
	{
	System.out.println("Enter the height");
	h=sc.nextInt();
	System.out.println("Enter the breadth");
	b=sc.nextInt();
	}
	public void area()
	{
		float ar=(float).5*b*h;
		System.out.println("Area of square is "+ar);
	}
}