import java.util.Scanner;
public class complex{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		comp c1=new comp();
		comp c2=new comp();
		System.out.println("Enter the first complex number:");
		c1.getdata();
		System.out.println("Enter the second complex number:");
		c2.getdata();
		int r1,r2;
		r1=c1.a+c2.a;
		r2=c1.b+c2.b;
		System.out.println("Complex no1:"+c1.a+"+"+c1.b+"i");
		System.out.println("Complex no2:"+c2.a+"+"+c2.b+"i");
		System.out.println("Sum of complex no1 and complex no2 is:"+r1+"+"+r2+"i");


	}
}
	class comp{
	int a,b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part:");
		a=sc.nextInt();
		System.out.println("Enter the imaginary part:");
		b=sc.nextInt();

	}
	
}
