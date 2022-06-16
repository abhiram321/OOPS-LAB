import java.util.Scanner;
class product{
	Scanner sc=new Scanner(System.in);
	int pcode,price;
	String pname;
	void getdata()
	{
		System.out.println("Enter the pcode:");
		pcode=sc.nextInt();
		System.out.println("Enter the pname:");
		pname=sc.next();
		System.out.println("Enter the price:");
		price=sc.nextInt();

	}
	void dis()
	{
		System.out.println("pcode="+pcode);
		System.out.println("Pname="+pname);
		System.out.println("Price="+price);
	}
}
public class price{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		product p1=new product();
		product p2=new product();
		product p3=new product();
		System.out.println("Enter the details of first product");
		p1.getdata();
		System.out.println("Enter the details of Second product");
		p2.getdata();
		System.out.println("Enter the details of third product");
		p3.getdata();
		System.out.println("Enter the details of product having lowest price:");
		int low=p1.price;
		if(p2.price<low)
		{
			p2.dis();
		}
		else if(p3.price<low)
		{
			p3.dis();
		}
		else
		{
			p1.dis();
		}

		

	}
}