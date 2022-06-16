import java.util.Scanner;
class circle{
	int r;
	float per,ar;
	void area(){	
		 ar=(float)3.14*r*r;
		System.out.println("Area="+ar);
	}
	void peri(){
		 per=(float)3.14*2*r;
		System.out.println("Perimeter="+per);
	}
}
public class CArea{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		circle c=new circle();
		System.out.println("Enter the radius");
		c.r=s.nextInt();
		c.area();
		c.peri();
	}
}