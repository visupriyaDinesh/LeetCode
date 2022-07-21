package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class PalindromeWithFixeLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queries = {2,201429812,8,520498110,492711727,339882032,462074369,9,7,6};
		int intLength = 1;
		long[] l = new long[queries.length];
		int[] q = queries;
		int count = 0;
		int start = (int)Math.pow(10, intLength-1);
		int end;
		if(intLength >1)
		end = (int)Math.pow(10, intLength);
		else
			end = 10;
		//Arrays.sort(queries);
		int finish = queries[queries.length - 1];
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		//List<Integer> li = new ArrayList<Integer>();
		
		for(int i = start ;  count<=finish && end<=i ; i++)
		{
			int x = i;
			int temp = 0;
			int res = 0;
			while(x > 0)
			{
				temp = x % 10;
				res = (res * 10)+ temp;
				x = x / 10;
			}
			if(i == res)
			{
				count ++;
				m.put(count, i);
			}
			System.out.println(count);
			x = 0;
			temp = 0;
			res = 0;
		}
		for (int i = 0; i < q.length; i++) {
			if(m.get(queries[i]) != null)
			l[i] = (long)(m.get(queries[i]));
			else
				l[i] = -1;
			System.out.println(l[i]);
		}
		
	}

}
