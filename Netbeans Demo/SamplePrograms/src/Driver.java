/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeevesh
 */
public class Driver
{
    public static void main(String[] args) 
    {
        Human minakshi = new Human();
        System.out.println(minakshi);
        minakshi.setName("M.K");
        System.out.println(minakshi);
        Human manoj = new Human("manoj",21);
        System.out.println(manoj);
    }
}
