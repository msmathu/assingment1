package assi1;

public class Pythogrontriplet
{
   public static void main(String[] args) 
   {
	int num = 1000;
    long ans;
    long product =-1;
    
    for(int a = 1; a<num/3; a++)
    {
        int b = (num*num-2*a*num)/(2*num-2*a);
        int c = num-a-b;
        if(c*c==(a*a+b*b))
        {
            ans = a*b*c;
            if(ans>product)
            {
                product = ans;
            }
            System.out.println(product);
        }
    }
}
}


