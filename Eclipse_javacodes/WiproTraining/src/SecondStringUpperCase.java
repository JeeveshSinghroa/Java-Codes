import java.util.*;
public class SecondStringUpperCase {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String s[]=str.split(" ");
		s[1]=s[1].toUpperCase();
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
}
