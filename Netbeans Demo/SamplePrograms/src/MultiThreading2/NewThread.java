/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading2;

/**
 *
 * @author Jeevesh
 */
public class NewThread implements Runnable
{
    Thread t;
    String name;
    NewThread(String name)
    {
        this.name=name;
        t = new Thread(this,name);
        System.out.println("New Thread: " + t);
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is exiting");
    }
}
