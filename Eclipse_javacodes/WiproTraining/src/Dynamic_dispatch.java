class BigB{
public void role(){
System.out.println("MynameisBigB");
}
}
class FatherRole extends BigB
{
//childclassisoverridingtherole()method
public void role(){
System.out.println("MyroleisFatherwhenIamwithmyson!");
}
}

class DriverRole extends BigB{
	//childclassisoverridingthename()method
	public void role(){
	System.out.println("MyroleisDriverwhenIamdrivingacar!");
	}
	}
	class CEORole extends BigB{
	//childclassisoverridingthename()method
	public void role(){
	System.out.println("MyroleisCEOwhenIaminsidemyowncompany");
	}
	}
	
 class Dyanmic_dispatch{
		public static void main(String s[]){
		System.out.println(" To demonstrate Runtime Polymorphism: ");
		BigB v;
		//Parentclassreferencevariablecanpointto
		//anyofitsCHILDclassobjects....
		v = new BigB();v.role();
		v= new FatherRole();v.role();
		v= new DriverRole();v.role();
		v= new CEORole();v.role();
		}
		}