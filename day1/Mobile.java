package week1.day1;

public class Mobile {

	
	public void makeCall() {
		
		String mobileModel = "2020" ;
		float mobileWeight = 160.55f;
		
		System.out.println("Mobile Model is " +mobileModel);
		System.out.println("Mobile weight is " +mobileWeight);
		
	}
	
	
	public void sendMsg() {
		
	     boolean isFullCharged = true;
	     int mobileCost = 15000; 
		
		System.out.println("Is Mobile Fully Charged and the Answer is " +isFullCharged);
		System.out.println("The Cost of the Mobile is " +mobileCost);
		
	}
	
	public static void main(String[] args) {

		Mobile m = new Mobile();
		m.makeCall();
		m.sendMsg();
		
		System.out.println("This is my Mobile");
	

	}

}
