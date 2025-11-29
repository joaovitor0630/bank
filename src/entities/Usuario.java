package entities;

public class Usuario {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Usuario() {
	}
	
	public Usuario(int accountNumber, String accountHolder){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		
	}
	
	public void deposit(double deposito) {
		balance = this.balance + deposito ;
	}
	
	public void saque(double saque) {
		balance -= (saque + 5);
	}

	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	
	
	
		
	
}
