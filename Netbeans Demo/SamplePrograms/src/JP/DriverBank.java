/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class DriverBank 
{
    public static void main(String[] args) 
    {
       Bank saving = new Bank();
       Bank current = new Bank();
       saving.setAcc_number(12345);
       saving.setAcc_type("saving");
       saving.setAcc_holder_name("J");
       current.setAcc_number(6789);
       current.setAcc_type("current");
       current.setAcc_holder_name("K");
        System.out.println(saving);
        System.out.println(current);
       
    }
}
