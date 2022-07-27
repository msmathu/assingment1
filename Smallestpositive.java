package assi1;

public class Smallestpositive 
{
	public static boolean isDivisible(int n)
	{
        for (int i = 1; i <= 20 ; i++) 
        {      
            if(n%i !=0 )
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int num = 1;
        while(!isDivisible(num))
        {
            num+=1;
        }
        System.out.println(num);
    }
    
}


