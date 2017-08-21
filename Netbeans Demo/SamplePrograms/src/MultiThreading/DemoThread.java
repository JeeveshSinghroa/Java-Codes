/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class DemoThread implements Runnable
{
    Thread t;
    DemoThread()
    {
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }
    @Override
    public void run()
    {
     try
         
     {
         for(int i=5;i>0;i--)
         {
             System.out.println("Child Thread: " + i);
             Thread.sleep(1000);
         }
     }
     catch(InterruptedException e)
     {
         System.out.println("Child interrupted");
     }
        System.out.println("Exiting child Thread");
    }
    
}
