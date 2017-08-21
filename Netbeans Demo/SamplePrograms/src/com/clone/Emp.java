/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clone;



/**
 *
 * @author Jeevesh
 */
public class Emp implements Cloneable
{
    String name;
    double sal;

    public Emp(String name, double sal) {
        this.name = name;
        this.sal = sal;
        
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getSal() 
    {
        return sal;
    }

    public void setSal(double sal) 
    {
        this.sal = sal;
    }
    
    // defining clone() as public so that we can access it also outside the class
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
