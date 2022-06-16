import java.util.Scanner;
public class StringSort{
	public static void main(String args[])
	{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no.of Strings:");
	n=s.nextInt();
	String s1[]=new String[n];
	System.out.println("Enter the Names:");
	for(int i=0;i<n;i++)
	{
		s1[i]=s.next();
	}
	System.out.println("Names:");
	for(int i=0;i<n;i++)
	{
		System.out.println(s1[i]);
	}
	System.out.println("After Sort:");
	String temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(s1[i].compareTo(s1[j])<0)
		
		  {
			temp=s1[i];
			s1[i]=s1[j];
			s1[j]=temp;
		  }

	    }
    }
    for(int i=0;i<n;i++)
    {
    	System.out.println(s1[i]);
    }

	}
}