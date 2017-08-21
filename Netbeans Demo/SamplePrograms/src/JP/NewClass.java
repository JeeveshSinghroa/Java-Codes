/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class NewClass 
{
    public static void main(String[] args) 
    {
        try
        {
            int c = 10/0;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
