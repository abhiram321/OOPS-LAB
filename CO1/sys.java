import java.util.Scanner;

public class sys{
	public static void main(String args[])
	{
		cpu c=new cpu();
		cpu.processor p=c.new processor();
		cpu.ram r=new  cpu.ram();
		c.getdata();
		p.getdata();
		r.getdata();
		System.out.println("----Details of CPU----");
		p.dis();
		r.dis();
		

	}
}
class cpu
{
	int price;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		price=sc.nextInt();
	}
	void dis()
	{
		System.out.println("Price: "+price);

	}
		 class processor
		 {
			int core;
			String man;
			void getdata()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("--PROCESSOR--");
				System.out.println("Enter no. of core");
				core=sc.nextInt();
				System.out.println("Enter the manufacturer");
				man=sc.next();
				
			}
			void dis()
			{	 System.out.println("--PROCESSOR--");
				System.out.println("  Core  :"+core);
				System.out.println("  manufacturer  :"+man);
			}
		}
		static class ram{
			int memory;
			String man;
			void getdata()
			{
			
				Scanner sc=new Scanner(System.in);
				System.out.println("--RAM--");
				System.out.println("Enter memory in GB :");
				memory=sc.nextInt();
				System.out.println("Enter the manufacturer :");
				man=sc.next();
			
			}
			void dis()
			{
				System.out.println("--RAM--");
				System.out.println("  memory :"+memory+"GB");
				System.out.println("  manufacturer :"+man);
			}
		}
}