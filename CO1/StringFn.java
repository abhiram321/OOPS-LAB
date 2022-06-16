import java.util.Scanner;
public class StringFn{
	public static void main(String Args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		s1=sc.next();
		System.out.println("Enter the string 2:");
		s2=sc.next();
		System.out.println("Length of "+s1+" is "+s1.length());
		System.out.println("Length of "+s2+" is "+s2.length());
		System.out.println("Concat "+s1+" and "+s2+" is "+s1.concat(s2));
		System.out.println("Upper case:"+s1.toUpperCase());
		System.out.println("Lower case:"+s2.toLowerCase());
		System.out.println("Character at position 3 in "+s1+" is "+s1.charAt(3));
		System.out.println("Index  of e  "+s1+" is "+s1.indexOf('e'));
		System.out.println("Replace :"+s1.replace('l','u'));
		System.out.println("Trim :"+s1.trim());
		System.out.println("Substring: "+s1.substring(1,3));
		System.out.println("Equals:"+s1.equals(s2));
		System.out.println("Compare to:"+s1.compareTo(s2));
		System.out.println("Intern"+s1.intern());
		System.out.println("EndsWith:"+s1.endsWith("o"));
		System.out.println("EndsWith:"+s2.endsWith("o"));
		System.out.println("StartsWith:"+s2.startsWith("H"));
		System.out.println("StartsWith:"+s2.startsWith("o"));
		
		
		

	}
}