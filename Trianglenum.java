package assi1;

public class Trianglenum 
{
	 public static int triangleNum(int n) {
	        int sum=0;
	        for (int i = 0; i <=n ; i++) {
	            sum+=i;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        int divisors = 0;
	        int size = 500;
	        int num = 0;
	        int j = 0;

	        while(divisors <= size) {
	            divisors = 0;
	            j++;
	            num = triangleNum(j);
	            for (int i = 1; i <= Math.sqrt(num); i++){
	                if (num % i == 0) divisors++;
	            }
	            divisors*=2;               
	        }
	        System.out.println(num);
	    }
	}


