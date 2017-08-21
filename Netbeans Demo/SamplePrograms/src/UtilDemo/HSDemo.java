/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Jeevesh
 */
public class HSDemo 
{
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        HashSet<Emp> hs = new HashSet<>();
        hs.add(new Emp("isha", 21));
        hs.add(new Emp("sonam", 22));
        hs.add(new Emp("mk", 23));
        hs.add(new Emp("manisha", 24));
        
        
        
        Iterator i = hs.iterator();
        while(i.hasNext())
        {
            Emp e = (Emp) i.next();
            System.out.println("Name is " + e.getName());
            System.out.println("Age is " + e.getAge());
        }
    }
}
