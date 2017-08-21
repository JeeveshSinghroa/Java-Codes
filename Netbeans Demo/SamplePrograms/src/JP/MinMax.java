/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class MinMax  
{
    void add(int... a)
    {
       int c;
       int len = a.length;
       for(int i=0;i<(len-1);i++)
       {
          for(int j=i+1;j<len;j++)
          {
              if(a[i]>a[j])
              {
                  c=a[i];
                  a[i]=a[j];
                  a[j]=c;
              }
          }
       }
        System.out.println("min is = "+ a[0]+" max is = "+ a[len-1]);
    }
    public static void main(String[] args) 
    {
        MinMax a = new MinMax();
        a.add(8,4,5);
        a.add(4,6,3,0);
    }
}
