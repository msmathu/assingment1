package assi1;

public class Sumofprime {
	 public static void main(String[] args) {
	        long num = 2000000; 
	        boolean[] prime = new boolean[(int)(num+1)];

	        for (int i = 2; i <= num ; i++) {
	            prime[i] = true;
	        }

	        for(int i = 2; i < Math.sqrt(num); i++){
	            if(prime[i]){
	                for(int j = i; i*j <= num; j++){
	                    prime[i*j] = false;
	                }
	            }
	        }

	        long sum = 0;
	        for (int i = 0; i <=num; i++) {
	            if(prime[i]){
	                sum += i;
	            }
	        }
	        System.out.println(sum);
	    }    
	}


