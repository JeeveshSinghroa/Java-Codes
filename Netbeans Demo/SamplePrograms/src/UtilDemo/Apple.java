/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
public class Apple
{
    String color;
    int wt;

    public Apple(String color, int wt) {
        this.color = color;
        this.wt = wt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWt() {
        return wt;
    }

    public void setWt(int wt) {
        this.wt = wt;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Apple obj = (Apple) o;
        
        if(obj.getColor().equals(this.color) && obj.getWt()==this.wt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
