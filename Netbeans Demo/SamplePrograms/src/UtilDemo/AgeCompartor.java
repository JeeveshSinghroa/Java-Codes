/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

import java.util.Comparator;

/**
 *
 * @author Jeevesh
 */
public class AgeCompartor implements Comparator<Emp>
{

    @Override
    public int compare(Emp o1, Emp o2) 
    {
        if(o1.getAge()>o2.getAge())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
}
