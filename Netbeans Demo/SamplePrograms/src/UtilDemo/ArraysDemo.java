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
public class ArraysDemo 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1[] = new int [5];
        int a2[] = new int [5];
        System.out.println("Enter first array elements");
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=s.nextInt();
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=s.nextInt();
        }
        Boolean check = Arrays.equals(a1,a2);
        if(check==true)
        {
            System.out.println("Equal");
            
        }
        else
            System.out.println("not equal");
        Arrays.sort(a1);
        System.out.println("Sorted first array is:");
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
            
        }
        int loc = Arrays.binarySearch(a1,3);
        System.out.println("value of i where  3 exists :" + loc);
    }
}
