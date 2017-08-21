/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */ 
import java.text.SimpleDateFormat;
import java.util.*;
public class DateFormatDemo 
{
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        String s = sdf.format(d);
        System.out.println(s);
    }
}
