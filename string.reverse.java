package ramu;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String str;
		char ch;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		str=in.nextLine();
		System.out.print("reverse of a string "+str+" is:");
		for(int j=str.length();j>0;j--)
		{
			System.out.print(str.charAt(j-1));
			assertEquals("sai",str);
			
		}
		assertEquals(str,str);
		
		
	}

}
