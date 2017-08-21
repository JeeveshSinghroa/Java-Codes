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
public class RandomNumberGeneration 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        System.out.println("Generate random number");
        int rn = r.nextInt();
        System.out.println(rn);
        int rn1 = r.nextInt(9999);
        System.out.println(rn1);
    }
}
