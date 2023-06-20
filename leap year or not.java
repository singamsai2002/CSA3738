package nani;
import static org.junit.Assert.assertTrue;
import java.util.*;
public class nani5{
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("enter the date/month/year");
		String sai = aa.next();
		String[] re = sai.split("/",3);
		int x = Integer.parseInt(re[2]);
		assertTrue(x==2000);
		if(x%4==0)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is a not leap year");
		}
	}
}
