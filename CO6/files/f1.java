import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class f1
{
public static void main(String args[])
{
	File f=new File("new.txt");
	System.out.println("Enter your option read or write(r/w)");
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	try{
		 if(s1.equals("w"))
		{
			FileWriter fl=new FileWriter("new.txt",true);
			System.out.println("Enter data to insert");
			String s2=s.next();
			fl.write(s2);
			fl.close();
		}
		else if(s1.equals("r"))
		{
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				String d=sc.nextLine();
				System.out.println(d);
			}
		}
		else
		{
			System.out.println("Error Occuered");
		}

	}catch(IOException e)
	{
		System.out.println("Exception");
	}


}
}