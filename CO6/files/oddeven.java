import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class oddeven
{
public static void main(String args[])
{

		int n;
	try{


	File f=new File("new1.txt");
	Scanner s=new Scanner(f);

	while(s.hasNextLine())
	{
		n=s.nextInt();
		if(n%2==0)
		{
			FileWriter f1=new FileWriter("even.txt",true);
			f1.write(String.valueOf(n));
			f1.write(" ");
			f1.close();

		}
		else{
			FileWriter f2=new FileWriter("odd.txt",true);
			f2.write(String.valueOf(n));
			f2.write(" ");
			f2.close();
		}

	}
	
}catch(IOException e){}


}
}