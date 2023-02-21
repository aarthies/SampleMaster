package ScubaB;

class Employee{  
	   int EmpNo; 
	   String Name;  
	   static String MNC ="Nissan";   
	   Employee(int r, String n){  
	   EmpNo = r;  
	   Name = n;  
	   }
	   void display (){System.out.println("Emp No: "+EmpNo+" "+"Name: "+Name+" "+"MNC "+MNC);}  
	}   
	public class StaticUsage{  
	 public static void main(String args[]){  
		 Employee s1 = new Employee(5319,"Aarthies");  
		 Employee s2 = new Employee(7196,"Azar"); 
		 Employee s3 = new Employee(8756,"Arun"); 
	 s1.display();  
	 s2.display(); 
	 s3.display();
	 }  
	}  