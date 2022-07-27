package assi1;

public class Fibonaccisequence 
{
	    public static void main(String[] args)
	    {
	    	 
	        int a = 0, b = 1, temp = 0, res = 0;
	        while(a <= 4000000)
	        {
	            temp = a;        
	            a = b;
	            b += temp;

	            if( b%2 == 0)
	            {     
	                res += b;
	            }
	       }
	        System.out.println(res);
	    }   
}	    
	    
	
	 