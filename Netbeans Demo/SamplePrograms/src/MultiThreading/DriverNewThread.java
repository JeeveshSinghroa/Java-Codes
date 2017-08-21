/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class DriverNewThread 
{
    public static void main(String[] args) 
    {
        NewThread ta = new NewThread();
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
            
        }
        catch(InterruptedException e)
            {
                System.out.println("Main Thread interrupted");
            }
        System.out.println("Main thread Exiting");
    }
}
