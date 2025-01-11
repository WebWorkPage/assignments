package IntroTo_oops;
import java.util.Arrays;
import java.util.Scanner;

class Product {
	int pid;
	int price;
	int quantity;
	
	Product(int pid, int price, int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getPid() {
		return pid;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
}

public class Person {
	
	int age=18;
	String name; 
	
	Person(int age, String name){
		 this.age=age;
		 this.name=name;
//		 System.out.println(name + " " + age);
	}
	
	public static int highestPrice(Product arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getPrice() > max) {
				max = arr[i].getPrice();
			}
		}
		return max;
	}
	
	public static int totalAmount(Product arr[]) {
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i].getPrice() * arr[i].getQuantity();
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Person a = new Person(20, "xyz");
		
		Product arr[] = new Product[5];  //arr of dataype - Product
		for(int i=0;i<5;i++) {
			System.out.println("Enter "+(i+1)+" product information - pid, price, quantity");
			int pid=sc.nextInt();
			int price=sc.nextInt();
			int quantity=sc.nextInt();
			arr[i] = new Product(pid, price, quantity);
		}
		System.out.println("Highest price "+highestPrice(arr));
		System.out.println("Total amount spent on all products"+totalAmount(arr));
		
	}

}


