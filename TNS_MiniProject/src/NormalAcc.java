
public class NormalAcc extends ShopAcc {
	protected static float deliveryCharge = 50;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	@Override
	void bookProduct(float charges) {
		System.out.println("Charges are:"+ deliveryCharge);
		
	}
	
	@Override
	public String toString() {
		System.out.println("\n Dear Normal Account User ... ") ;
		System.out.println("Your account Number is " + (getAccNo()) + "\n"+"Name" + getAccNm());
		return "\n";

	}
}
