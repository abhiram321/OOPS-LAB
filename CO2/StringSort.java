import java.util.Scanner;
public class StringSort{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=s.nextInt();
		String s1[]=new String[n];
		System.out.println("Enter the Strings:");
		for(int i=0;i<n;i++)
		{
			s1[i]=s.next();
		}
		System.out.println("Before Sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("After sorting:");
		String temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
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
			System.out.println( s1[i]);
		}



	}
}