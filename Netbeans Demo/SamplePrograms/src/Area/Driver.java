/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author Jeevesh
 */
public class Driver 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(3);
        Triangle t = new Triangle(7,9);
        Rectangle r = new Rectangle(4,8);
        System.out.println(c);
        System.out.println(t);
        System.out.println(r);
        System.out.println("Area of circle is = " + c.area());
        System.out.println("Area of Triangle is = " + t.area());
        System.out.println("Area of Rectangle is = " + r.area());
    }

    
}
