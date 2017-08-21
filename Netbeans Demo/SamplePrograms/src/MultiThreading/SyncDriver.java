/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Jeevesh
 */
public class SyncDriver 
{
    public static void main(String[] args) {
        SynDemo s1 = new SynDemo("One");
        SynDemo s2 = new SynDemo("Two");
        s1.start();
        s2.start();
    }
}
