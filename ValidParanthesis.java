package leetCode;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "([)]";
		Stack<Character> st = new Stack<Character>();
		boolean check = true;
		for(int i = 0; i < str.length() ; i++ )
		{
		if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
		{
			st.push(str.charAt(i));
		}
		else
		{
			if(!st.isEmpty())
			{
				if(str.charAt(i) == ')')
				{
					if(st.peek().equals('('))
						st.pop();
					else
					{
						check = false;
						break;
					}		
				}
				else if(str.charAt(i) == '}')
				{
					if(st.peek().equals('{'))
						st.pop();
					else
					{
						check = false;
						break;
					}		
				}
				
				else if(str.charAt(i) == ']')
				{
					if(st.peek().equals('['))
						st.pop();
					else
					{
						check = false;
						break;
					}		
				}
			}
			else
			{
				check = false;
			}
		}
		}
		System.out.println(check);
	}

}
