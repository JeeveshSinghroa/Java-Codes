/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package math.operation;

/**
 *
 * @author Jeevesh
 */
public class Factorial 
{
    public void fact(int a)
    {
        int j=1;
        for(int i=1;i<=a;i++)
        {
           j=j*i; 
        }
        System.out.println(j);
    }
}
