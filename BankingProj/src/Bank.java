// Create a simple java code to implement Banking Application. Make sure these 4 functions are present(Transfer Amount, View Balance, Deposit, Withdraw).
// Accept details from user, deposit and withdraw then view balance then transfer account function.
// 
import java.util.*;
public class Bank{
	int amount;
	String name;
	String accno;
	Bank(int amount,String name,String accno){
		this.amount = amount;
		this.name = name;
		this.accno =  accno;
	}
	void view(int option){
		System.out.println("amount is:"+amount);
		System.out.println("name is:"+name);
		System.out.println("accno is:"+accno);
	}
	void deposit(int option){
		System.out.println("Deposit");
	}
	void transfer(int option){
		System.out.println("Transfer");
	}
	void withdraw(int option){
		System.out.println("Withdraw");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String user = sc.next();
		Object obj = user;
		System.out.println("1.Deposit Amount \n2.Withdraw Amount \n3.View Balance \n4.Transfer Amount \nEnter your option:");
		int option = sc.nextInt();
		Bank A1100 = new Bank(500,"mrunal","A1100");
		Bank A2101 = new Bank(400,"reva","A2101");
		Bank A3102 = new Bank(600,"hitesh","A3102");
		((Bank) obj).view(1);
		sc.close();
	}
}