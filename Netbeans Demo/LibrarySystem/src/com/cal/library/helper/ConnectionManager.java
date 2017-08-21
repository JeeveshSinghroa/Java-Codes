/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cal.library.helper;
import java.sql.*;

/**
 *
 * @author Jeevesh
 */
public class ConnectionManager
{
    public static Connection getConnection() 
    {
        Connection c = null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
}
