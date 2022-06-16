import java.util.Scanner;
public class inherit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter no. of teachers ");
	n=sc.nextInt();
	teacher t[]=new teacher[n];
	for(int i=0;i<n;i++)
	{
		t[i]=new teacher();
	}
	System.out.println("\nDetails of teachers\n");
			for(int i=0;i<n;i++)
			{
				t[i].dis();
			}


	}
}
class employee
{
	int empid,salary;
	String name,address;
	employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Details\n");
		System.out.println("Enter empid");
		empid=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter address");
		address=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
	}


}
class teacher extends employee
{
	String dep,sub;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department");
		dep=sc.next();
		System.out.println("Enter subject");
		sub=sc.next();
	}
	void dis()
	{
		System.out.println("Name:"+name);
		System.out.println("Empid:"+empid);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
		System.out.println("Department:"+dep);
		System.out.println("Subject:"+sub);
		System.out.println();
	}
	
}