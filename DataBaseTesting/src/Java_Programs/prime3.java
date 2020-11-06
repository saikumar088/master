package Java_Programs;



public class prime3 {

	public static int  isprimeNumber(int num) {
		
		int flag=1;
		
		int j;
		

		
		for (j=2;j<=num;j++)
		for (int i=2;i<=j;i++) {
			
			if (num<=1)
			{
				
				flag=0;
			    
			break;
			
			}
			
			else if(j%i==0)
			{
				flag=0;
				break;
				
			}
			
			else if (j%i!=0) {
				
				flag=1;
				
				System.out.println(j);
				
			}
			
		} 
			
		return j;
		
	}
	

	
	
	public static void main(String[] args) {
		
		//can be divided by itself or 1
		
		//Checking the   
	
		/*
		System.out.println("2 is prime number:"+isprimeNumber(2) );
		System.out.println("250 is prime number:"+isprimeNumber(250) );
		System.out.println("7 is prime number:"+isprimeNumber(7) );
		System.out.println("21 is prime number:"+isprimeNumber(21) );
		System.out.println("-2 is prime number:"+isprimeNumber(-2) );
		*/
		isprimeNumber(40);
		
		
		
		
		

	}

}
