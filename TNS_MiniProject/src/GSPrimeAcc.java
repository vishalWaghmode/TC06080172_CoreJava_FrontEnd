
public class GSPrimeAcc extends PrimeAcc{
	
	private static final float Charges = 0;
	
	public float getCharges() {
		return Charges;
	}

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float Charges) {
		System.out.println("Your Product Charges are: "+charges);
		System.out.println("Your Delivery Charges are: "+"0");
		System.out.println("Final Payable amount:"+charges);
		
		
	}
	
	
@Override
	
	public String toString() {
		System.out.println("Dear Prime User ... ") ;
		System.out.println("Your account is created with Number:" + (getAccNo()) + "\n"+ "Name: " + getAccNm());
		return "\n";

	}

}
