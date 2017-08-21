/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class DriverAbstract 
{
    public static void main(String[] args) 
    {
      Male m = new Male();
      Female f = new Female();
      m.reading();
      m.ds();
      m.sleeping();
      m.driving();
      f.reading();
      f.ds();
      f.sleeping();
      f.driving();
    }
}
