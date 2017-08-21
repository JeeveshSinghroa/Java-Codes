/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class NewThread extends Thread
{
    NewThread()
    {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                    System.out.println("Child Thread: " + this);
                    Thread.sleep(500);
            }
            
        }
        catch(InterruptedException e)
            {
                System.out.println("Child interrupted");
            }
            System.out.println("Exiting child thread");
    }
   
}
