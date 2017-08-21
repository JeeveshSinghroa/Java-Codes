/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class DriverDemoThread 
{   
    public static void main(String args[])
    {
    DemoThread n = new DemoThread();
    try
    {
        for(int i=5;i>0;i--)
        {
            System.out.println("Main Thread: "+i);
            Thread.sleep(2000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Main Interrupted");
    }
        System.out.println("Main Exiting");
    }
}
