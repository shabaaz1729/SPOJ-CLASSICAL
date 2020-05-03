import java.util.*;
import java.lang.*;

class SBANK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
			int t;
			Scanner ob = new Scanner(System.in);
			t = ob.nextInt();
			while(t>0)
			{
				int N = ob.nextInt();
				ArrayList<String> accounts = new ArrayList<String>();
				HashMap<String,Integer> count = new HashMap<String,Integer>();
				
				
				for(int i=0;i<N+1;i++)
				{
					String s = ob.nextLine();
					accounts.add(s);
					if(count.containsKey(s)) {
						
						int x = count.get(s);
						count.put(s,++x);
					}
					else {
						count.put(s,1);
					}
				}
				
				Collections.sort(accounts);
				int size = accounts.size(), i=1;
				
				while(i<size)
				{
					System.out.println(accounts.get(i)+" "+count.get(accounts.get(i)));
					i+=count.get(accounts.get(i));
				}
				t--;
				
			}
		} catch(Exception e) {
			return;
		}
	}
}