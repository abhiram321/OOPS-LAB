import java.util.Scanner;
import arith.ad;
import arith.mu;
import arith.su;
import arith.di;
public class operation{
	public static void main(String args[])
	{
		ad a1=new ad();
		mu m1=new mu();
		su s1=new su();
		di d1=new di(); 
		Scanner sc=new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\nEnter your choice\n1.Addition\n2.Multiplication\n3.Substraction\n4.Division\n5.Exit\n");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:a1.result();
					break;
			case 2:m1.result();
					break;
			case 3:s1.result();
					break;
			case 4:	d1.result();
					break;
			case 5:break;
			
			default: System.out.println("Invalid Input!!");

				}

		}while(opt!=5);
	}
}