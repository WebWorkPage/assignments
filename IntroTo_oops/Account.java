package IntroTo_oops;
import java.util.Scanner;

public class Account {
	int amount;
	int Balance;
	
	public Account(int amount) {
		this.amount = amount;
		this.Balance = 0;
	}
	
	public void depositAmount(int amount) {
		Balance = Balance + amount;
		System.out.println("amount deposited successfully");
	}
	
	public boolean withdrawAmount(int withdraw) {
		if(withdraw <= amount) {
			return true;
		}
		return false;
	}
	
	public int displayBalance(int withdraw) {
		this.Balance = amount-withdraw;
		return Balance;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		int amount=sc.nextInt();
		Account obj = new Account(amount);
		obj.depositAmount(amount);
		System.out.println("Enter the amount to withdraw");
		int withdraw=sc.nextInt();
		if(obj.withdrawAmount(withdraw)) {
			System.out.println("withdrawed successfully");
			System.out.println("The balance amount is "+ obj.displayBalance(withdraw));
		}
		else {
			System.out.println("enter the withdraw amount within the deposit amount");
		}
		
	}
}