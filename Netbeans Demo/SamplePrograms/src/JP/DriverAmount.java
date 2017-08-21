/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class DriverAmount 
{
    public static void main(String[] args) 
    {
        Amount tax = new Amount();
        tax.amount=260000;
        tax.others=60000;
        tax.tax_vlaue=6000;
        System.out.println(tax);
    }
}
