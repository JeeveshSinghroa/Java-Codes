package StringHandson;
import java.util.*;
public class String_6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String b=scanner.nextLine();
		if(a.length()<b.length())
		{
			System.out.println(a+b+a);
		}
		if(a.length()>b.length())
		{
			System.out.println(b+a+b);
		}
	}

}
