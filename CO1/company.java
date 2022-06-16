import java.util.Scanner;
class employee
{
	int eno,esalary;
	String ename;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno:");
		eno=sc.nextInt();
		System.out.println("Enter ename");
		ename=sc.next();
		System.out.println("Enter esalary");
		esalary=sc.nextInt();
	}
	void dis()
	{
		System.out.println("Eno"+eno);
		System.out.println("Ename:"+ename);
		System.out.println("Esalary:"+esalary);
		System.out.println();
	}
}
public class company{
	public static void main(String args[])
	{
			int n;
			System.out.println("Enter th eno. of employee:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			employee e[]=new employee[n];
			for(int i=0;i<n;i++)
			{
				e[i]=new employee();
			}

			System.out.println("Enter details of employee");
			for(int i=0;i<n;i++)
			{
				e[i].getdata();
			}

			System.out.println(" details of employee");
			for(int i=0;i<n;i++)
			{
				e[i].dis();
			}

			System.out.println("Enter the employee number you want search");
			int se=sc.nextInt();
			int f=1,l=0;
			for(int i=0;i<n;i++)
			{
				if(e[i].eno==se)
				{
					f=0;
			
					break;
				}
				l++;
			
			}
				if(f==0)
				{
					e[l].dis();
				
				}
				else
				{
					System.out.println("Employee not present");
				}			
			



	}
}