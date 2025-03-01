

class atm
{
    public atm() {
        
    }
	private double balance;
	private double deposit;
	private double withdraw;
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setDeposit(double deposit){
		this.deposit = deposit;
	}
	public double getDeposit(){
		return deposit;
	}
	public void setWithdraw(double withdraw){
		this.withdraw = withdraw;
	}
	public double getWithdraw(){
		return withdraw;
	}
}