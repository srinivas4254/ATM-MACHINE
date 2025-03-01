
import java.util.Scanner;
class atmMain
	{ private static int status;
        
		public static void main(String[] arg){
             
			Scanner sc = new Scanner(System.in);
			atmOperation ao = new atmOperation();
			System.out.println("welcome to your bank");
			int AtmNumber = 123456;
			int AtmPin = 1234;
			System.out.println("Enter Atm number:");
			int AtmNumber1 = sc.nextInt();
			
			System.out.println("Enter Atm pin:");
			int Atmpin1 = sc.nextInt();
            if( (AtmNumber1 ==AtmNumber ) && (Atmpin1==AtmPin ))
		     {   while(true){ 
		          System.out.println("choose one option");
				 System.out.println(" 1.view balance\n 2.withdraw\n 3.Deposit\n 4.miniStatement\n 5.exit");
				   int enter = sc.nextInt();
				   if (enter==1)
				   {
					   ao.viewbalance();
				   }
                   else if (enter==2) {
                       System.out.println("enter the amount to withdraw:");
                       Double w = sc.nextDouble();
                       ao.WithdrawAmount(w);
                }
                else if (enter==3) {
                    System.out.println("enter the amount to Deposit:");
                    Double D= sc.nextDouble();
                    ao.DepositAmount(D);
                }	
                else if (enter==4){
                     System.out.println("mini Satement");
                     ao.MiniStatement();
                }		
                else if (enter==5) {
                    System.out.println("exit");
                    System.exit(status);
                }	 
		     
			else{
				System.out.println("choose correct one");
			}}
            }
            else {
                System.out.println("incorrect atm number");
                System.exit(status);  
            }
			
	}}