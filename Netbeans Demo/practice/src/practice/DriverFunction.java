/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.lang.Math.*;

/**
 *
 * @author Jeevesh
 */
public class DriverFunction 
{
    public static void main(String arg[])
    {
        double i,a,b,s,c;
        Function f1 = new Function();
        for(i=-25;i<=25;i++)
        {
            if(f1.set_x(i)*f1.set_x(i+1)<=0)
            {
                break;
            }
        }
        if(f1.set_x(i)*f1.set_x(i+1)==0)
        {
            if(f1.set_x(i)==0)
            {
                System.out.println("The roots of the equation are = "+i+" and "+ -i);
                System.exit(0);
            }
            else
            {    
                c=i+1;
                System.out.println("The roots of the equation are = " + c +"and" + -c );
                System.exit(0);
            }
        }
        a = i;
        b = i+1;
        s = (a+b)/2;
        while(Math.abs(f1.set_x(s))>0.0001)
        {
            if(f1.set_x(a)*f1.set_x(s)>0)
            {
                a = s;
            }
            else
            {
                b = s;
            }
            s=(a+b)/2;
        }
        
        System.out.println("The roots of the equation are = " + s +" and "+ -s);
    }
}
