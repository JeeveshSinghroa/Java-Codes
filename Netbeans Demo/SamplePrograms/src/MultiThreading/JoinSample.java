/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class JoinSample
{
    private int count=0;
    public void run() throws InterruptedException
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run()
            {
                for(int i=1;i<=20000;i++)
                {
                    count = count +1;
                   // System.out.println(count);
                }
            }
        });
        
        t1.start();
        t1.join();
        
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() 
            {
                for(int i=1;i<=20000;i++)
                {
                    count = count +1;
                   // System.out.println(count);
                }
            }
        });
        
        t2.start();
        
        try
        {
        
        t2.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println(count);
    }
}
