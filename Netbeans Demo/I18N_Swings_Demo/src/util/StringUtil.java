package util;

import java.io.UnsupportedEncodingException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITS-KKR
 */
public class StringUtil
{
    public static String toUTF8(String isoString)
    {
        String utf8string = null;
        if(null != isoString && !isoString.equals(""))
        {
            try
            {
              byte[] stringBytesISO=isoString.getBytes("ISO-8859-1");
              utf8string = new String(stringBytesISO,"UTF-8");
            }catch(UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            utf8string = isoString;
        }

       return utf8string;
    }
}
