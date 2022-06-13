//Dimitri Rodriguez
//P9.12
//CS234
public class Employee{
	protected String name;  // Intialzing name as a String
	protected double salary;  //Intializing salary as a double
	
	public Employee(String name, double salary){
		this.name = name;  // Defining name
		this.salary = salary;  // Defining salary
	}
	
	public String toString(){
		return  "Name: " + name + "Salary :" + salary;   // Returning variables with stings
	}
}