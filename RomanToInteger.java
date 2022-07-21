package leetCode;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "XXVII";
		int result = 0;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		result = map.get(s.charAt(s.length()-1));
		for (int i = s.length()-2; i >= 0;  i--) {
			if(map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
				result = result + map.get(s.charAt(i));
			else
				result = result - map.get(s.charAt(i));
		}
		System.out.println(result);
	}

}
