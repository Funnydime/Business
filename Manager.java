//Dimitri Rodriguez
//P9.12
//CS234
public class Manager extends Employee{

	protected String department;  //Intializing department as a String
	
	public Manager(String name, double salary, String department){
		super (name, salary); //Reaching variables upper in the heiarchy
		this.department = department; // Defining department
		name = name; // Defining name
		salary = salary; // Defining salary
	}
	
	public String toString(){
		return "Name: " + name + " Salary: " + salary + " Department: " + department; // Returning variables with stings
	}
}