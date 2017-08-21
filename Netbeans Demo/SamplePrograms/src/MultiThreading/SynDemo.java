/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;


/**
 *
 * @author Jeevesh
 */
public class SynDemo extends Thread
{
    String name;

    public SynDemo(String name) {
        super(name);
    }
    
    String cal[]={"Java","J2EE","PHP","Android"};
    
    @Override
    public void run()
    {
        display(getName());
    }
    synchronized void display(String name)
    {
        for(int i=0;i<cal.length;i++)
        {
            System.out.println("Thread Name is " + name + " Cal value is " + cal[i]);
        }
    }
}
