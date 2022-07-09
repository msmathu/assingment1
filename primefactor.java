package assi1;

public class primefactor 
{
	public static void main(String[] args) 
	{
        long n = 600851475143L;
        for (long i = 2; i < n/2 ; i++)
        {
            while (n%i==0) 
            {         
                n=n/i;             
            }
        }
        System.out.println(n);
    }   
}


