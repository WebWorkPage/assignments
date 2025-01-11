package IntroTo_oops;


public class Employee extends Person{
	int employeeID;
	int salary;
	public Employee(int employeeID, int salary, String name, int age) {
		super(age, name);
		this.employeeID = employeeID;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("EmpID: " + employeeID);
		System.out.println("Salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(123, 50000, "xyz", 25);
		emp.displayEmployee();
	}
}
