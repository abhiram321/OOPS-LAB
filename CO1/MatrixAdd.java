import java.util.Scanner;
public class MatrixAdd{
	public static void main(String args[])
	{
	Scanner c=new Scanner(System.in);
	int m,n;
	System.out.println("Enter no. of rows:");
	m=c.nextInt();
	System.out.println("Enter no. of columns:");
	n=c.nextInt();
	int a[][]=new int[m][n];
	int b[][]=new int[m][n];
	int ab[][]=new int[m][n];
	System.out.println("Enter the first matrix:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=c.nextInt();
		}
	}
	System.out.println("Enter the second matrix:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			b[i][j]=c.nextInt();
		}
	}
	System.out.println("First matrix is:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Second matrix is:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ab[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("After matrix addition:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		System.out.print(ab[i][j]+" ");
		}
		System.out.println();
	}

	}
}