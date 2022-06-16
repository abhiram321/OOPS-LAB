import java.util.Scanner;
public class inherit2{
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
	System.out.println(" details of teachers");
			for(int i=0;i<n;i++)
			{
				t[i].dis();
			}


	}
}
class person
{
	int age;
	String name,address,gender;
	person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter address");
		address=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Gender");
		gender=sc.next();
	}


}
class employee extends person
{
	int empid,salary;
	String cname,qual;
	employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empid");
		empid=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter Company_name");
		cname=sc.next();
		System.out.println("Enter Qualification");
		qual=sc.next();
	}
	
	
}class teacher extends employee
{
	String sub;
	int tid,deid;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teacherid");
		tid=sc.nextInt();
		System.out.println("Enter departmentid");
		deid=sc.nextInt();
		System.out.println("Enter subject");
		sub=sc.next();
	}
	void dis()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);

		System.out.println("Empid:"+empid);
		System.out.println("Salary:"+salary);
		System.out.println("Company name:"+cname);
		System.out.println("Qualification:"+qual);

		System.out.println("Subject:"+sub);
		System.out.println("Teacher Id:"+tid);
		System.out.println("Departmentid:"+deid);


	}


}