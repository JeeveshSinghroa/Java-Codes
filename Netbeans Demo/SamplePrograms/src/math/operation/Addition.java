/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package math.operation;

/**
 *
 * @author Jeevesh
 */
public class Addition 
{
    /**
     *
     * @param a
     */
    public void add(int... a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
