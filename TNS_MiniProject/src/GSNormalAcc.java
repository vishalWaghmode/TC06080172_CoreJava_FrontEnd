
public class GSNormalAcc extends NormalAcc{


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{	
		System.out.println("Your Product Charges are: "+charges);
		System.out.println("Your Delivery Charges are: "+deliveryCharge);
		System.out.println("Final Payable amount:"+(charges + deliveryCharge));
	}
	
	public String toString() {
		System.out.println("Dear Normal User ... ") ;
		System.out.println("Your account is created with Account Number:" + (getAccNo())+ "\n"+ "Name: " + getAccNm());
		return "\n";

	}

}
