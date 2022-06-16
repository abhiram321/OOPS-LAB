import java.util.Scanner;
public class search{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n;
System.out.println("Enter the array limit:");
n=c.nextInt();
int ar[]=new int[n];
System.out.println("Enter the array:");
for(int i=0;i<n;i++)
	ar[i]=c.nextInt();
System.out.println("Array is:");
for(int i=0;i<n;i++)
	System.out.println(ar[i]);
int s;
System.out.println("Enter the element to search:");
s=c.nextInt();
int f=0;
for(int i=0;i<n;i++)
{
	if(ar[i]==s)
	{
	f=1;break;
	}

}
if(f==1)
	{
	System.out.println("Element found");
	}
	else
	{
		System.out.println("Element not found");
	}

}
}