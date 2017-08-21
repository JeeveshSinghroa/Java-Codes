/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author Jeevesh
 */
public class Rectangle 
{
    int l,b;
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    double area()
    {
        return l*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "l=" + l + ", b=" + b + '}';
    }
    
}
