/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Jeevesh
 */
public class TreeSetDemo 
{
    public static void main(String[] args) {
        TreeSet<Emp> ts = new TreeSet<Emp>(new AgeCompartor());
        ts.add(new Emp("isha", 21));
        ts.add(new Emp("sonam", 22));
        ts.add(new Emp("mk", 23));
        ts.add(new Emp("manisha", 24));
        
        
        Iterator i =  ts.iterator();
        
        while(i.hasNext())
        {
            Emp e =(Emp) i.next();
            System.out.println("Name is " + e.getName());
            System.out.println("Age is " + e.getAge());
        }
    }
}
