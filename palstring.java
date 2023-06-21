package karthik;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class pal {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	String str;
	char ch;
	String reversedstr="";
	System.out.print("Enter a string");
	str=sc.nextLine();
	System.out.print("Reverse of a string"+str+"is:");
	for(int j=str.length();j>0;j--)
	{
		reversedstr=reversedstr+str.charAt(j-1);
	}
	System.out.println(reversedstr);
	assertEquals("madam",reversedstr);
	if(str.equals(reversedstr))
	{
		System.out.println("it is a palindrome");
		
	}
	else {
		System.out.println("it is not a palindrome");
	}
			
}
}
