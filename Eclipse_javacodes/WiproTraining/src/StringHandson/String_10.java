package StringHandson;
import java.util.*;
public class String_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String str1=scanner.nextLine();
		String s="";
		int len=0;
		char[] c1=str.toCharArray();
		char[] c2=str1.toCharArray();
		if(str.length()>str1.length())
		{
			len=str.length();
		}
		else
		{
			len=str1.length();
		}
		for(int i=0;i<len;i++)
		{
			if(i<str.length())
			{
				s=s+str.charAt(i);
			}
			if(i<str1.length())
			{
				s=s+str1.charAt(i);
			}
		}
		System.out.println(s);
	}

}
