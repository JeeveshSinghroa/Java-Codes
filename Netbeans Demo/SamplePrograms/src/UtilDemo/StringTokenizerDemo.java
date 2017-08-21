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
public class StringTokenizerDemo 
{
    public static void main(String[] args) {
        String s = "A;B;C";
        StringTokenizer st = new StringTokenizer(s,";");
        while(st.hasMoreTokens())
        {
            String val = st.nextToken();
            System.out.println(val);
        }
    }
}
