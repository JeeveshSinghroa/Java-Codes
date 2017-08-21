/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading2;

/**
 *
 * @author Jeevesh
 */
public class Driver 
{
    public static void main(String[] args) 
    {
        NewThread t1 = new NewThread("one");
        NewThread t2 = new NewThread("two");
        NewThread t3 = new NewThread("three");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main interrupted");
        }
        System.out.println("Main is exiting");
    }
   
}
