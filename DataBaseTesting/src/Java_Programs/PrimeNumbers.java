package Java_Programs;

public class PrimeNumbers {

	public static boolean isprimeNumber(int num) {
		
		if (num<=1)
		{
			
		return false;
		}
		
		for (int i=2;i<num;i++) {
			
			
			if(num%i==0)
			{
				return false;
				
			}
			
		}
			
		return true;
			
			
			
		}
	
	public static void getPrimeNumbers (int num) {
		
		for (int i=2;i<=num;i++)
		{
			if(isprimeNumber(i))
			{
				
				System.out.print(i+ " ");
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//can be divided by itself or 1
		
		//Checking the   
		
		System.out.println("2 is prime number:"+isprimeNumber(2) );
		System.out.println("250 is prime number:"+isprimeNumber(250) );
		System.out.println("7 is prime number:"+isprimeNumber(7) );
		System.out.println("21 is prime number:"+isprimeNumber(21) );
		System.out.println("-2 is prime number:"+isprimeNumber(-2) );
		
		getPrimeNumbers(40);
		
		
		
		
		

	}

}
