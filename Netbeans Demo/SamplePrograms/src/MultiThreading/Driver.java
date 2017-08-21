/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class Driver 
{
    public static void main(String[] args) 
    {
        A a = new A();
        B b = new B();
        C c = new C();
        a.setPriority(5);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);
        /*System.out.println("check");*/
        a.start();
        b.start();
        c.start();
    }
}
