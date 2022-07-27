package assi1;

public class Problem19 
{

	public static int NoofSundays(int ystart, int yend)
	{
        int count = 0;
        while(ystart <= yend) 
        {
            for (int m = 1; m <= 12; m++) 
            {
                if(dayOfWeek(ystart, m,1)==0)
                {   
                    count++;
                }
            }
            ystart++;
        }
        return count;
    }

    public static int dayOfWeek(int year,int month,int day)
    {
         
        int m = (month - 3 + 4800) % 4800;
		int y = (year + m / 12) % 400;
		m %= 12;
        int d = (y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7;
		return d;
    }

    public static void main(String[] args) 
    {
        System.out.println(NoofSundays(1901, 2000));
    }
}
