package Java_Programs;

import org.testng.annotations.Test;

public class Fibonacci {
	
	@Test
    public void forloop() {

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
	@Test
    public void whileloop() {
    int i = 1, n = 10, t1 = 0, t2 = 1;
    System.out.print("First " + n + " terms: ");

    while (i <= n)
    {
        System.out.print(t1 + " + ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;

        i++;
    }
}  
    
    
	@Test
    public void givenNumber() {

            int n = 100, t1 = 0, t2 = 1;
            
            System.out.print("Upto " + n + ": ");
            while (t1 <= n)
            {
                System.out.print(t1 + " + ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    
    

}
