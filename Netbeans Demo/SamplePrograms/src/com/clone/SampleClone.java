/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clone;

/**
 *
 * @author Jeevesh
 */
public class SampleClone
{
    public static void main(String[] args) 
    {
        Emp staff[] = new Emp[3]; // array of objects
        
        staff[0] = new Emp("mk", 13413.33);
        staff[1] = new Emp("manoj", 12221.42);
        staff[2] = new Emp("jeevesh", 22221.42);
        try {
            Emp manager = (Emp) staff[2].clone(); // clone of staff[2]
            manager.setName("XYZ");
            manager.setSal(23123.45);
            System.out.println("Manager name is "+ manager.getName());
            System.out.println("Manager salary is "+ manager.getSal());
        }
        catch (CloneNotSupportedException ex)
        {
            System.out.println(ex);
        }
        
        // enhanced for loop
        for(Emp e : staff)
        {
            System.out.println("Name is " + e.getName());
            System.out.println("Salary is " + e.getSal());
        }
        
        
       
    }    
}
