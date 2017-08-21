/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Jeevesh
 */
public class MapDemo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm = new HashMap<>();
        
        hm.put(1, "Isha");
        hm.put(2, "neha");
        hm.put(3, "nitu");
        hm.put(4, "anil");
        
        Set s = hm.keySet();
        
        Iterator i = s.iterator();
        
        while(i.hasNext())
        {
            int key = (int) i.next();
            String value = hm.get(key);
            System.out.println(key +" : " + value);
        }
        
        
    }
}
