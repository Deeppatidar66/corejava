package co.in.oops;

public class AccountBank {
	private int balance = 0;
	 
	public void setBalance(int b) {
		balance = b;
	}
	
	public int getBalance() {
		return balance;
		
	}
	public void deposit(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
//		System.out.println(getBalance());
	}
}