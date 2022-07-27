package assi1;

import java.math.BigInteger;

public class Problem20
{
	 public static int SumDigits(String s){
	        int sum = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int temp = Integer.parseInt(s.substring(i, i+1));
	            sum +=temp;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        BigInteger fact = BigInteger.valueOf(1);
	        
	        for (int i = 1; i <=100; i++) {
	            fact = fact.multiply(BigInteger.valueOf(i));
	        }
	        System.out.println(SumDigits(fact.toString()));
	    }
	}
