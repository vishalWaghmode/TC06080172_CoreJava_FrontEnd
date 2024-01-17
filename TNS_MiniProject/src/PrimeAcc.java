
public class PrimeAcc extends ShopAcc{
	public static boolean isPrime;
	float deliveryCharges;
	
	public PrimeAcc(int accNo, String accNm,float charges,boolean isPrime) {
		super(accNo,accNm,charges);
		this.setIsPrime(isPrime);
	}
	
	void bookProduct(float charges) {
		System.out.println("Charges are:" + charges);
	}
	
	public String toString() {
		System.out.println("\n Dear Prime Account User ... ") ;
		System.out.println("Your account Number is " + (getAccNo()) + "\n" + "Name:" + getAccNm());
		return "\n";

	}
	public boolean isIsPrime() {
		return isPrime;
	}

	public void setIsPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
}
