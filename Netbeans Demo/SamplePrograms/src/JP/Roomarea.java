/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
class Room
{
    float length;
    float breadth;
   
    void getdata(float a,float b)
    {
        length=a;
        breadth=b;
    }
}
public class Roomarea 
{
 public static void main(String arg[]) 
 {
     float area;
     Room room1=new Room();
     room1.getdata(14,10);
     area=room1.length*room1.breadth;
     System.out.println("Area="+area);
 }
}
