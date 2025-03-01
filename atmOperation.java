
import java.util.HashMap;
import java.util.Set;
class atmOperation implements atmInterface
{
	atm atm = new atm();
	HashMap<Double,String> mini=new HashMap<>();

     	@Override	
	public void viewbalance(){
        atm.setBalance(10000);
		System.out.println("available balance :" + atm.getBalance());
	}
    	@Override
	public void WithdrawAmount(double WithdrawAmount){
		if(WithdrawAmount%500==0){
			if(WithdrawAmount<=atm.getBalance()){
				System.out.println("take your cash :"+ WithdrawAmount);
				mini.put(WithdrawAmount,"withdraw amount");
				atm.setBalance(atm.getBalance() - WithdrawAmount);
				viewbalance();
	}
	else{
		System.out.println("insuffient balance");
	}}
	else{
		System.out.println("enter multiple of 500 rupees only");
	}}
    	@Override
  	public void DepositAmount(double DepositAmount)	{
		System.out.println("deposit Amount :" + DepositAmount);
		mini.put(DepositAmount,"deposit");
		atm.setBalance(atm.getBalance()+DepositAmount);
		viewbalance();
	}
		@Override
	public void MiniStatement(){
		Set<Double> set =mini.keySet();
		for(Double d :set){
			System.out.println(d +"="+mini.get(d));
		}
	}}