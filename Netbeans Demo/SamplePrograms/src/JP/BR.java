/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *super keyword
 * @author Jeevesh
 */
public class BR extends Room1 
{
  int h;
  public BR(int l,int b,int h)
  {
      super(l,b);
      this.h=h;
  }
  int vol()
  {
      return (l*b*h);
  }
}
