/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
import java.util.Iterator;
import java.util.ArrayList;
public class IteratorDemo 
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("java");
        al.add("j2ee");
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
