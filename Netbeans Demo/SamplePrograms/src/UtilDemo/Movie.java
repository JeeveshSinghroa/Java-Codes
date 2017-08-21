/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilDemo;

/**
 *
 * @author Jeevesh
 */
public class Movie 
{
    String name, actor;
    int release_yr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getRelease_yr() {
        return release_yr;
    }

    public void setRelease_yr(int release_yr) {
        this.release_yr = release_yr;
    }
    @Override
     public boolean equals(Object o)
     {
         Movie m = (Movie)o;
         
         return m.actor.equals(this.actor)&& m.name.equals(this.name)&& m.release_yr==this.release_yr;
         
     }
    
    @Override
    public int hashCode()
    {
        return actor.hashCode()+name.hashCode()+release_yr;
    }
    
    
}
