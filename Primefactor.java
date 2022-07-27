package assi1;
import java.util.*;
public class Primefactor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        long n =sc.nextLong();
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


