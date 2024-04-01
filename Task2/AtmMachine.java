package ATM;
import java.util.*;

interface ATMOperations {
    void withdrawl();
    void deposit();
    void checkBalance();
    void showManu();
}

public class AtmMachine implements ATMOperations{
	private static final int PIN = 8156;
	private int balance = 0;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		AtmMachine atm = new AtmMachine();
		System.out.println("Welcome to the Atm\n");
	
		int i=0;
		while(i < 3)
		{
			System.out.println("Enter security pin : ");
			int pin = scan.nextInt(); 
			if(pin == PIN )
			{
				atm.showManu();
				break;
			}
			else {
				if(i<2) {
					System.out.println("Enter your valid pin");
				}
				else {
					System.out.println("Your pin is wrong");
					System.out.println("You have reach Maximum limit Try again Tomorrow ");
				}
				i++;
			}
		}
		
	}
	public void showManu() {
		
		int choice;
		do {
			System.out.println("Choose 1: for withdrawl");
			System.out.println("Choose 2: for Deposit");
			System.out.println("Choose 3: for check Balance");
			System.out.println("Choose 4: for Exit");
			
			System.out.println("Enter your choice :");
			choice = scan.nextInt();
			switch(choice)
			{
				case 1:withdrawl();
				       break;
				case 2:deposit();
					   break;
					
				case 3:checkBalance();
					   break;
				
				case 4:System.out.println("Thanks for visiting ATM Machine");
					   break;
					   
				default :System.out.println("Enter the valid choice");
					
				
			}
		}while(choice != 4);
		
	}
	public void checkBalance() {
		System.out.println("Your balance is :"+balance);
	}
	public void withdrawl() {
		System.out.println("How many amount you want to withdrawl :");
		int amount = scan.nextInt();
		if(amount <= balance)
		{
			balance -= amount;
			
		}
		else {
			System.out.println("insufficient Balance");
		}
		checkBalance();
	}
	public void deposit() {
		System.out.println("How Mnay amount you want to deposit :");
		int amount = scan.nextInt();
		balance += amount;
		checkBalance();
	}
	

}
