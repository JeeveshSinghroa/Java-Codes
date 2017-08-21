/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
public class EqualsDemo
{
    public static void main(String[] args) {
        
        Apple a1 = new Apple("red", 100);
        Apple a2 = new Apple("red", 100);
        
        //Apple a2 =a
        
        if(a1.equals(a2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
