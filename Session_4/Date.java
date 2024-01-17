package Session_4;

public class Date {
		private int d,m,y;
		
		public Date() {}
		
		public Date(int d,int m,int y) {
			this.d=d;
			this.m=m;
			this.y=y;
		}
		public String toString() {
			return "Date [d = " + d + ", m = " + m + ", y = " + y + " ]";
		}
		
		public static void swapDate(Date d1[]) {
			/*
			 * Date temp; 
			 * temp=d1; 
			 * d1=d2; 
			 * d2=temp;
			 */
			
			Date temp; 
			temp=d1[0]; 
			d1[0]=d1[1]; 
			d1[1]=temp;
			
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
/*			Date d1=new Date(20,10,2023);
			Date d2=new Date(22,11,2023);
			System.out.println("Before swapping:  ");
			System.out.println("d1 : "+d1);		//will not get swapped
			System.out.println("d2 : "+d2);
			Date.swapDate(d1,d2);
			System.out.println("After swapping:  ");
			System.out.println("d1 : "+d1);
			System.out.println("d2 : "+d2);
			
*/
			Date[] d1=new Date[2];
			d1[0]=new Date(20,10,2023);
			d1[1]=new Date(22,11,2023);
			System.out.println("Befor swapping:  ");
			System.out.println("d1 : "+d1[0]);
			System.out.println("d2 : "+d1[1]);
			Date.swapDate(d1);
			System.out.println("After swapping:  ");
			System.out.println("d1 : "+d1[0]);
			System.out.println("d2 : "+d1[1]);	
		/*
			 * //Scanner- get size of an array
			 *  int i[]=new int[size];
			 *   int []a= {1,2,34,3,7};
		 */			
		}
}
