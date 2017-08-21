import com.yyy.Circle;
public class Area
{
	public static void main(String args[])
	{
		Circle c= new Circle(3.56);
		double r,a,pi=3.14;
		r=c.getdata();
		a=pi*r*r;
		System.out.println(a);
	}
}