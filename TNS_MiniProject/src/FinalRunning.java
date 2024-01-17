
import java.util.Scanner;


public class FinalRunning {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String accNm=sc.next();
	
		int accNo= 8745262;
		
		boolean isPrime=false;
		
		System.out.println("\nEnter the type of account you want to create 1.Prime Account 2.Normal Account");
		int choice=sc.nextInt();
		
		
		
		switch(choice)
		{
		
		case 1: //Prime Acc
		             GSShopFactory gssP=new GSShopFactory();
		             gssP.getNewPrimeAccount(accNo, accNm, 1000, isPrime);
			break;
			
		case 2: //Normal Acc
			    
		     GSShopFactory gssN=new GSShopFactory();
             gssN.getNewNormalAccount(accNo, accNm,1000,50);
	     	break;
	     	
		}
	}
}
