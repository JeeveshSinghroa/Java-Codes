/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clone;

/**
 *
 * @author Jeevesh
 */
public class Jeevesh 
        {
    public static void main(String[] args) 
    {
        Human j[] = new Human[2];
        j[0] = new Human("jeevesh",18);
        j[1] = new Human("vineet",18);
        try{
            Human clone = (Human) j[0].clone();
            clone.setName("jacky");
            clone.setAge(18);
            System.out.println("clone name is = " + clone.getName());
            System.out.println("clone age is = " + clone.getAge());
        }
        catch(CloneNotSupportedException ex)
        {
            System.out.println(ex);
        }
        for(Human e : j)
        {
            System.out.println("Name is = " + e.getName());
            System.out.println("Age is = " + e.getAge());
        }
    }
}
