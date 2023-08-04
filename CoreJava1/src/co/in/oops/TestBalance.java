package co.in.oops;

public class TestBalance {
	public static void main(String[] args) {
	AccountBank a = new AccountBank();
	a.setBalance(5000);
	a.deposit(4000);
	
	System.out.println(a.getBalance());
	
		
		
	}

}
