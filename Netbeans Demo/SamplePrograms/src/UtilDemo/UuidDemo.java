/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
import java.util.*;
public class UuidDemo 
{
    public static void main(String[] args) 
    {
        UUID u = UUID.randomUUID();
        System.out.println(u);
        System.out.println(u.toString().substring(1,6));
    }
}
