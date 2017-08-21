/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class Varags 
{
    void add(int... a)
    {
        int sum=0;
        int len = a.length;
        for(int i=0;i<len;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum is = "+sum);
    }
    public static void main(String[] args) 
    {
        Varags a = new Varags();
        a.add(1,2);
        a.add(1,2,3);
        a.add(2,3,4,6,7);
    }
}
