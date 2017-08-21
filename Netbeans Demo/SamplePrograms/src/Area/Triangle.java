/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

/**
 *
 * @author Jeevesh
 */
public class Triangle extends Shape 
{
    int l,b;
    public Triangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    double area()
    {
        return ((0.5)*(l*b));
    }

    @Override
    public String toString() {
        return "Triangle{" + "l=" + l + ", b=" + b + '}';
    }
    
}

