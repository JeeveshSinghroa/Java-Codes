package StringHandson;
import java.util.*;
public class String_7 {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		str=str.replace('x', ' ');
		str=str.trim();
		System.out.println(str);
	}
}
