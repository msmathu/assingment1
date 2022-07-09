package assi1;

import java.math.BigInteger;

public class problem16 {
	 public static void main(String[] args) {
	        //2(2^1000)
	        String temp = BigInteger.ONE.shiftLeft(1000).toString();
	        int sum = 0;
	        for(int i=0;i<temp.length();i++){
	            sum+= temp.charAt(i) - '0';
	        }
	        System.out.println(Integer.toString(sum));
	    }
	}


