
public abstract class ShopAcc {
   protected static int accNo;
   protected static String accNm;
   protected static float charges;
   
   
   
   public static int getAccNo() {

	return accNo;
}
public static void setAccNo(int accNo) {
	ShopAcc.accNo = accNo;
}
public static String getAccNm() {

	return accNm;
}
public static void setAccNm(String accNm) {
	ShopAcc.accNm = accNm;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}
void bookProduct(float charges) {
		System.out.println("Product booked and charges are:"+charges);
	};
   void items(float charges){
	   System.out.println("Items are delivered with charges :"+charges);
	
   };
   
public ShopAcc(int accNo, String accNm, float charges) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.charges = charges;
}
@Override
public String toString() {
	return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()=" + super.toString() + "]";
}
   
   
   
}