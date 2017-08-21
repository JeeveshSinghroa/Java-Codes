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
public class NameComparator implements Comparator<Emp>
{

    @Override
    public int compare(Emp o1, Emp o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
    
}
