import java.util.Scanner;

public class Account {
	String customerName;
	String customerID;
	Double balance = 0.0;
	String previousTransaction = "No transaction made yet";
	
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	void calculateInterest() {
		double interest = balance * .01;
		System.out.println("Your interest for this year (at 1.0%) is: +" + interest);
	}
	
	void deposit() {
		System.out.print("Please enter the amount to deposit: ");
		Scanner input = new Scanner(System.in);
		double amountToDeposit = input.nextDouble();
		balance += amountToDeposit;
		previousTransaction = "+" + String.valueOf(amountToDeposit);
	}
	
	void withdraw() {
		System.out.print("Please enter the amount to withdraw: ");
		Scanner input = new Scanner(System.in);
		double amountToWithdraw = input.nextDouble();
		balance -= amountToWithdraw;
		previousTransaction = "-" + String.valueOf(amountToWithdraw);
	}
	
	void showMenu() {
		char inputOption = '0';
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest for this year");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.print("Enter an option: ");
			
			Scanner input = new Scanner(System.in);
			char inputOption1 = input.next().charAt(0);
			inputOption = Character.toUpperCase(inputOption1);
			
			switch(inputOption) {
			
			//Case 'A' allows the user to check their balance
			case 'A':
				System.out.println("======================");
				System.out.println("Your balance: $" + balance);
				System.out.println("======================");
				break;
				
			//Case 'B' allows the user to make a deposit
			case 'B':
				deposit();
				break;
			
			//Case 'C' allows the user to make a withdrawal
			case 'C':
				withdraw();
				break;
			
			//Case 'D' allows the user to check his/her previous transaction
			case 'D':
				System.out.println("Your previous transaction was: " + previousTransaction);
				break;
				
			//Case 'E' allows the user to calculate their interest"
			case 'E':
				calculateInterest();
				break;
				
			//Case 'F' exits the program
			case 'F':
				System.out.println("======================");
				break;
				
			//This lets the user know they input something incorrectly
			default:
				System.out.println("Error: invalid option. Please try again: ");
				break;
			} 
		} while (inputOption != 'F');
			System.out.println("Thanks for banking with us!");
		
	}
	
}
