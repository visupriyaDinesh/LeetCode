package leetCode;

import java.util.Stack;

public class LongestValiParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")()())"; 
		//String s = "(()";
		Stack<Character> st = new Stack<Character>();
		int count = 0;
		int max = 0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='(' && s.charAt(i+1)==')'&& i < s.length()-1)
			{
				st.push(s.charAt(i));
			}
			else
			{
				if( !st.isEmpty()&&st.pop() == '(' )
				{
					count+= 2;
				}
				else if(st.isEmpty()) {
					count = 0;
 				}
				if(max<count)
				max = count;
			}
		}
		System.out.println(max);
		}
	}


