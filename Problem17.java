package assi1;

public class Problem17 {
	 private static final String[] ONES = {
		        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
		        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		    
		    private static final String[] TENS = {
		    "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

		    private static String toWords(int n) 
		    {
		        if (0 <= n && n < 20)
		            return ONES[n];
		        else if (20 <= n && n < 100)
		            return TENS[n / 10] + (n % 10 != 0 ? ONES[n % 10] : "");
		        else if (100 <= n && n < 1000)
		            return ONES[n / 100] + "hundred" + (n % 100 != 0 ? "and" + toWords(n % 100) : "");
		        else if (1000 <= n && n < 1000000)
		            return toWords(n / 1000) + "thousand" + (n % 1000 != 0 ? toWords(n % 1000) : "");
		        else
		            throw new IllegalArgumentException();
		    }

		    public static String NuminWords(int n)
		    {
				int sum = 0;
				for (int i = 1; i <= n; i++)
					sum += toWords(i).length();
				return Integer.toString(sum);
			}
		    public static void main(String[] args)
		    {
		        System.out.println(NuminWords(1000));
		    }
		}	


