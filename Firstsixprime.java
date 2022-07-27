package assi1;

public class Firstsixprime 
{
	   public static void main(String[] args)
	   {
	        
	        long numOfPrimes = 0;
	        int num = 1;
	        int max = 10000000;
	        boolean[] prime = new boolean[max];
	        for ( int i = 2; i < max; i++ ) 
	        {
	            if ( prime[i] == true ) continue;

	            numOfPrimes++;

	            if ( numOfPrimes == 10001 ) 
	            {
	                num = i;
	                break;
	            }

	            for ( int j = i+i; j < max; j += i )   
	                prime[j] = true;      
	        }
	        System.out.println(num);
	    }
	}


