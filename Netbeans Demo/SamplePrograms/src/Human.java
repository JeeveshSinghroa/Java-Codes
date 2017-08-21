/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeevesh
 */
public class Human
{
  String name;
  int age;

    public Human(String name, int age)
    {
       this();
        this.name = name;
        this.age = age;
        
    }

    public Human() 
    {
        System.out.println("default constructor");
    }
  
    
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
  @Override
    public String toString()
    {
        return "Name is " + getName() + " & age is " + getAge();
    }
  
}
