/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jeevesh
 */
public class UDAL 
{
    public static void main(String[] args) 
    {
        ArrayList<Emp> al = new ArrayList<Emp>();
        
        al.add(new Emp("Anu",21));
        al.add(new Emp("Shanu",22));
        al.add(new Emp("Isha",23));
        al.add(new Emp("MK",24));
        
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            Emp e = (Emp) i.next();
            System.out.println("Name is: " + e.getName());
            System.out.println("Age is: " + e.getAge());
        }
        
    }
}


