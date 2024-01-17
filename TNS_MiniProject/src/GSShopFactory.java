
public class GSShopFactory extends ShopFactory{

	
	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(++AccNo, accNm, charges, isPrime);
		
		System.out.println(" \nWelcome to Prime  Account  transaction Portal:");
	
		gsprime.toString();
		gsprime.bookProduct(1000);
		
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
GSNormalAcc gsnormal = new GSNormalAcc(++AccNo, accNm, charges, deliveryCharges);
		
		System.out.println(" \nWelcome to Normal Account  transaction Portal :");
		
		gsnormal.toString();
		gsnormal.bookProduct(1000);
		return null;
	}

}
