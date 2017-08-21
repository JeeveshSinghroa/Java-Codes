/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Jeevesh
 */
public class LinkedListDemo
{
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.add("hello");
        ll.add("java");
        ll.add("j2ee");
        ll.add("android");
        
        
        
        Iterator i = ll.descendingIterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
