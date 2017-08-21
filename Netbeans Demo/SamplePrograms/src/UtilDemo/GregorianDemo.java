/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
import java.util.GregorianCalendar;
import java.util.*;
public class GregorianDemo 
{
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        System.out.println("Enter the year");
        int yr = gc.get(Calendar.YEAR);
        if(gc.isLeapYear(yr))
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a Leap Year");
    }
}
