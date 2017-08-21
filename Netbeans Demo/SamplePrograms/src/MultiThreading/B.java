/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class B extends Thread 
{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
                   System.out.println("Thread B = " + i);
        }
    }
}
