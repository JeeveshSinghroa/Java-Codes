/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class Bank 
{
    int acc_number;
    String acc_type;
    String acc_holder_name;

    public int getAcc_number() 
    {
        return acc_number;
    }

    public void setAcc_number(int acc_number) 
    {
        this.acc_number = acc_number;
    }

    public String getAcc_type() 
    {
        return acc_type;
    }

    public void setAcc_type(String acc_type) 
    {
        this.acc_type = acc_type;
    }

    public String getAcc_holder_name() 
    {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) 
    {
        this.acc_holder_name = acc_holder_name;
    }

    @Override
    public String toString() 
    {
        return "Bank{" + "acc_number=" + acc_number + ", acc_type=" + acc_type + ", acc_holder_name=" + acc_holder_name + '}';
    }

   
 }

