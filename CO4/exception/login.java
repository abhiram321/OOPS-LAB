import java.util.Scanner;
class ex extends Exception
{
	public ex(String s)
	{
	super(s);
	}
}
class validate
{
	public void get() throws ex
	{
		String u="Anandhu";
		String p="1234";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the username : ");
		String usr=sc.next();
		System.out.print("Enter the password : ");
		String pas=sc.next();
		if(usr.equals(u) && pas.equals(p))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			throw new ex("Invalid Username or Password");
		}		

	}
}
class login
{
	public static void main(String args[])
	{
		validate v=new validate();
		try{

			v.get();
		}
		catch(ex e)
		{
			System.out.println("Exception::::::"+e);
		}
	}
}