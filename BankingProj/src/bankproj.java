import java.util.Scanner;
public class bankproj {
	static String[] accno = new String[]{"A1101","A2102","A3103"};
	static int[] amount = new int[]{1000,2000,3000};
	static String[] name = new String[]{"Hitesh","Revathi","Mrunal"};
	static String[] password = new String[] {"","",""};
	
	public static int checkAccount(String user, int index) {
	if(accno[index].equals(user)) {
		System.out.println("Account exist");
	}
	else {
		System.out.println("Account does not exist");
		}
		
		return index;
	}
	
	public static int getIndex(String user) {
		int loc=0;
		for(int i = 0;i<3;i++) {
			if(user.equals(accno[i])) {
				loc = i;
			}
		}
		return loc;
	}
	public static void view(int index)
	{
		System.out.println("Account no is: "+accno[index]);
		System.out.println("Accout holder name:"+name[index]);
		System.out.println("Account balance is:"+amount[index]);
	}
	public static void deposit(int amnt,int index) {
		amount[index] = amount[index] + amnt;
		System.out.println("Amount deposited!Current balance is: "+amount[index]);
	}
	public static void transfer(int desin,int amt,int index) {
		if(amount[index]<amt) {
			System.out.println("Insufficient Balance!");
		}
		else {
		amount[index] = amount[index] - amt;
		amount[desin] = amount[desin] + amt;
		System.out.println("Amount Transfered!Current Balance is: "+amount[index]);
		}
	}
	public static void withdraw(int wd,int index) {
		if(amount[index]<wd) {
			System.out.println("Insufficient Balance!");
		}
		else{
			amount[index] = amount[index] - wd;
			System.out.println("Amount Withdrawal Successful!Current balance is: "+amount[index]);
		}
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number:");
		String user = sc.next();
		int index = getIndex(user);  
		int check = checkAccount(user,index);
		int option=0;
		do {
		System.out.println("1.Deposit Amount \n2.Withdraw Amount \n3.View Details \n4.Transfer Amount \n5.Exit \nEnter your option:");
		option = sc.nextInt();
		switch(option) {
		case 1: 
			System.out.println("Enter the amount to deposit:");
			int am = sc.nextInt();
			deposit(am,index); //A3103,200
			break;
		case 2:
			System.out.println("Enter the amount to withdraw:");
			int wd = sc.nextInt();
			withdraw(wd,index);
			break;
		case 3:
			view(index);
			break;
		case 4:
			System.out.println("Enter destination account no:");
			String des = sc.next();
			int desin = getIndex(des);
			System.out.println("Enter amount to transfer:");
			int amt = sc.nextInt();
			transfer(desin,amt,index);
			break;
		case 5:
			System.out.println("Exiting...");
			break;
		default:
				System.out.println("Invalid Input!");
				break;
		}
		
		
	}while(option!=5);
	sc.close();

}
}
