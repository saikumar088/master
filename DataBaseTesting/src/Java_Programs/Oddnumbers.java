package Java_Programs;

public class Oddnumbers {

	public static void main(String[] args) {
		
		
		System.out.println("For loop Odd numbers are : ");
	
		
		for(int i=1;i<=20;i++)
		{
			
			if (i%2!=0)
			{
				
				System.out.println(i + " ");
				
				
			}
			
		} 
		
		//while loop
		
		System.out.println("While loop Odd numbers are : ");
		int j=1;
		
		while (j<=20)
		{
		
			if (j%2!=0)
			{
				System.out.println(j + " ");
					
			}
			j++;
		}
		
		
		//do while 
		System.out.println("Do While loop Odd numbers are : ");
		int k=1;
		
		do 
		{
		
			if (k%2!=0)
			{
				System.out.println(k + " ");
					
			}
			k++;
			
		} while (k<=20);
			
			
	}

}
