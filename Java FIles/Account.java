/*1a. Constructors are use for the create the object and declare it's instance data.
 * 
 * 1b. Constructors differ from other methods in a class because they do not return anything or even need to write a 
 * return type, the constructor is used to create the object.
 * 
 * 2. The difference between private and public is that private you can't access the varabile outside the class and in public you can.
 * The private is used for instance data in a object that isn't need to be directily changed and public should be used for methods inside
 * a class.
 * 
 * 3a. Java uses the toString() method to take the data from the class and print it out in its detail as a string.
 * 
 * 3b.This method can be used be another class if only if that method is written in that class. 
 */
public class Account {
	private double balance;
	private String name; 
	private long acctNum; 
	
	// --------------------------------------------- 
	//Constructor -- initializes balance, owner, and account number 
	// -------------------------------------------- 
	public Account(double initBal, String owner, long number) 
	{ 
		balance = initBal; 
		name = owner; 
		acctNum = number; 
	} 
	// -------------------------------------------- 
	// Checks to see if balance is sufficient for withdrawal. 
	// If so, decrements balance by amount; if not, prints message. 
	// -------------------------------------------- 
	public void withdraw(double amount) 
	{ 
		if (balance >= amount) 
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	} 
	// -------------------------------------------- 
	// Adds deposit amount to balance. 
	// -------------------------------------------- 
	public void deposit(double amount) 
	{ 
		balance += amount; 
	} 
	// -------------------------------------------- 
	// Returns balance. 
	// -------------------------------------------- 
	public double getBalance() 
	{ 
	return balance; 
	} 
	// -------------------------------------------- 
	// Returns a string containing the name, account number, and balance. 
	// -------------------------------------------- 
	public String toString() 
	{ 
	 return String.format("Name:%s\nAccount Number:%s\nBalnce:$%s",name,acctNum,balance);
	} 
	// -------------------------------------------- 
	// Deducts $10 service fee // 
	// -------------------------------------------- 
	public double chargeFee() { 
		balance -= 10;
		return balance;
	} 
	// -------------------------------------------- 
	// Changes the name on the account 
	// -------------------------------------------- 
	public void changeName(String newName) 
	{ 
		name = newName;
	}	
}
