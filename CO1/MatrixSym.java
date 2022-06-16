import java.util.Scanner;
public class MatrixSym{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the no. of rows:");
		m=s.nextInt();
		System.out.println("Enter the no. of columns:");
		n=s.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("Enter the matrix:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix is");
			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("Matrix transpose");
			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
int c=1;

			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					c++;
					break;
				}
			}
		}
		if(c==1)
		{
			System.out.println("Symetric");
		}
		else
			{
			System.out.println("Not Symetric");
		}

	}
}