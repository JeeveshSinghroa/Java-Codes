package StringHandson;
import java.util.*;
public class String_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		str.replace('*', ' ');
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				if(i==0)
				{
					str=str.replace(str.charAt(1), ' ');
				}
				if(i>0&&i<str.length()-1)
				{
					str=str.replace(str.charAt(i-1), ' ');
					str=str.replace(str.charAt(i+1), ' ');
				}
				if(i==str.length()-1)
				{
					str=str.replace(str.charAt(str.length()-2), ' ');
				}
				
			}
		}
		System.out.println(str);
	}

}
