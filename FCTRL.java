import java.util.*;
import java.lang.*;

class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
			int t;
			Scanner in = new Scanner(System.in);
			t = in.nextInt();
			while(t>0)
			{
				int num = in.nextInt(), result = 0, i = 1, x = num;
				
				while(x > 0)
				{
					result +=  num/(int)Math.pow(5,i);
					x = num/(int)Math.pow(5,i);
					i++;
				}
				
				System.out.println(result);
				t--;
			}
		} catch (Exception e) {
			return;
		}
	}
}