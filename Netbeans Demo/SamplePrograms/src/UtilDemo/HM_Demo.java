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
public class HM_Demo 
{
    public static void main(String[] args) 
    {
        Movie m = new Movie();
        m.setActor("salman");
        m.setName("wanted");
        m.setRelease_yr(2010);

        Movie m1 = new Movie();
        m1.setActor("salman");
        m1.setName("dabaang");
        m1.setRelease_yr(2011);

        Movie m2 = new Movie();
        m2.setActor("salman");
        m2.setName("Ek tha Tiger");
        m2.setRelease_yr(2012);

        Movie m3 = new Movie();
        m3.setActor("salman");
        m3.setName("Veer");
        m3.setRelease_yr(2013);
        
        
          Movie m4 = new Movie();
        m4.setActor("salman");
        m4.setName("dabaang");
        m4.setRelease_yr(2011);
        
        HashMap<Movie,String> h = new HashMap<>();
        h.put(m,"wanted");
        h.put(m1,"dabaang");
        h.put(m2,"Ek tha Tiger");
        h.put(m3,"Veer");
        h.put(m4,"dabaang");
        
        
        for (Movie mm : h.keySet())
        {
            System.out.println(h.get(mm).toString());
            
        }
        
            

        
    }
    
}
