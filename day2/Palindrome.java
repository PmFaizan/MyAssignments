package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
	
		int num = 34343;
		int temp = 0;
		int res = num;
		
		for (int i = num; i > 0; i = i/10) {
			
			int rem = i%10;
			temp = (temp*10) + rem;
			
		}
		
		if (num == temp) {
			System.out.println("The Given Number : "+num+ " Is Palindrome");
		}
		else
			System.out.println("The Given Number : " +num+ " Is Not a Palindrome");
	}

}
