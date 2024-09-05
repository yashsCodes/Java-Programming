class BankApp{
	public static void main(String args[]){
		BankAccount acc = new BankAccount("101",25000);
		System.out.println("Account NO : "+acc.getAccNo());
		System.out.println("Balance : "+acc.getBalance());
		acc.deposit(5000);
		System.out.println("Balance : "+acc.getBalance());
		acc.withdraw(7500);
		System.out.println("Balance : "+acc.getBalance());
	}
}

class BankAccount{
	private String accNo;
	private double balance;
	
	public BankAccount(String accNo, double balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void setAccNo(String accNo){
		this.accNo = accNo;
	}
	
	public void setBalance (double balance){
		this.balance = balance;
	}
	
	public String getAccNo(){
		return accNo;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double depositBalance){
		if(depositBalance >0){
			this.balance += depositBalance;
		}
	}
	
	public void withdraw(double withdrawalAmmount){
		this.balance -= withdrawalAmmount;
	}
}

