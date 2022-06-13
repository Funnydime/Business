//Dimitri Rodriguez
//P9.12
//CS234
public class Executive extends Manager{
	
	public Executive(String name, double salary, String department){
	super(name, salary, department); // Getting variables higher in the heiarchy
	name = name; // Defining variables
	salary = salary;
	department = department;
	}

	public String toString(){
		return "Name: " + name + " Salary: " + salary + " Department: " + department; // Returning variables with stings
	}
}