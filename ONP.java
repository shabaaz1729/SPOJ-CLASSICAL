import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
			
			Scanner ob = new Scanner(System.in);
			String str = null;
			int t = ob.nextInt();
			while(t>0)
			{
				str = ob.next();
				String result = "";
	 			Stack<Character> stackOfBraces = new Stack<Character>();
				Stack<Character> stackOfOperators = new Stack<Character>();
	 
				for(int i=0;i<str.length();i++)
				{	
					char c = str.charAt(i);
					if(c == '(')
						stackOfBraces.push(c);
					else if(c == '+' || c == '-'||  c == '*' || c == '/' || c=='^')
						stackOfOperators.push(c);
					else if(c == ')')
					{
						stackOfBraces.pop();
						result += stackOfOperators.pop();
					}
					else
						result += c;
				}
	 
				System.out.println(result);
				t--;
			}
		} catch(Exception e) {

			return;
		}
	}
}