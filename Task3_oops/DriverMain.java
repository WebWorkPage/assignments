package Task3_oops;
import java.util.Scanner;

interface Taxable{
	double salesTax = 0.07; //7/100
	double incomeTax = 10.5/100; //0.105
	double calculateTax();
}

class Employee implements Taxable{
	int empId;
	String name;
	int Salary;
	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.Salary = salary;
	}
	
	@Override
	public double calculateTax(){ //polymorphism
		return Salary * incomeTax;
	}
}

class Product implements Taxable{
	int pid;
	double price;
	int quantity;
	public Product(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public double calculateTax() { //polymorphism
		return price * salesTax * quantity;
	}
	
}

public class DriverMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee info(id, name, salary) ");
		int empId = sc.nextInt();
		String name = sc.nextLine();
		sc.nextLine();
		int salary = sc.nextInt();
		System.out.println("Enter product info(id, price, quantity) ");
		int pid = sc.nextInt();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		Employee obj1 = new Employee(empId, name, salary);
		System.out.println("Employee Income Tax: " + obj1.calculateTax()); //polymorphism
		
		Product obj2 = new Product(pid, price, quantity);
		System.out.println("Product Sales Tax: " + obj2.calculateTax()); //polymorphism
	}

}
