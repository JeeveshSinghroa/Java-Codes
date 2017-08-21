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
public class ScannerDemo 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.nextLine();
        System.out.println("Enter the age");
        int age = s.nextInt();
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
