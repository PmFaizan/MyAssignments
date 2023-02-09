package week1.day2;

public class PrimNumber {

	public static void main(String[] args) {


		int a = 13;
		boolean b = false;
		
		for(int i =2; i <= a/2; i++) {
			
			if(a%2==0) {
			
				b = true;
				break;
			}
			
		}
			if (!b) {
				System.out.println(a+" is a prime");
			}
		
			else 
				System.out.println(a+"  Is not a prime");
	}

}
