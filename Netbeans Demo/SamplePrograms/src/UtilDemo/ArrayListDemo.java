/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
import java.util.ArrayList;
public class ArrayListDemo 
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println(al.size());
        al.add("hello");
        al.add("java");
        al.add(14.6);
        al.add(9);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
