/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author Jeevesh
 */
public class Circle 
{
    int r;
    final double pi=3.14;
    public Circle(int r)
    {
        this.r=r;
    }
    
    double area()
    {
        return pi*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + ", pi=" + pi + '}';
    }
    
}
