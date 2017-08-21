class Employee extends Object { }
class Manager extends Employee { }
class Director extends Manager { }
class Test_Multi_Level_Inheritance
{
public static void salary(Object obj)
{
// Here, Object obj will accept the following:
// Object class objects
// Employee class objects
// Manager class objects
// Director class objects
	if(obj instanceof Director)
		System.out.println(" Director Salary 30000$");
		else if(obj instanceof Manager)
		System.out.println(" Manager Salary 20000$");
		else if(obj instanceof Employee)
		System.out.println(" Employee Salary 10000$");
		else System.out.println(" INVALID");
		}
}