package common;

import java.util.ResourceBundle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITS-KKR
 */
public class Constant
{
    public static ResourceBundle BUNDLE;
    public static Integer LANGUAGE=0;
    public static void initBundle()
    {
        if(LANGUAGE==0)
        {
            BUNDLE = ResourceBundle.getBundle("EN");
        }
        else if(LANGUAGE==1)
        {
            BUNDLE = ResourceBundle.getBundle("VI");
        }
        else if (LANGUAGE==2)
        {
            BUNDLE = ResourceBundle.getBundle("FR");
        }
         else if (LANGUAGE==3)
        {
            BUNDLE = ResourceBundle.getBundle("hi");
        }
        else if (LANGUAGE==4)
        {
            BUNDLE = ResourceBundle.getBundle("DE");
        }
             else if (LANGUAGE==5)
        {
            BUNDLE = ResourceBundle.getBundle("ES");
        }
             else if (LANGUAGE==6)
        {
            BUNDLE = ResourceBundle.getBundle("zh");
        }
    }
}
