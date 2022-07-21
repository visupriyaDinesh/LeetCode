package leetCode;



public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon ";
		String[] str = s.split("\\s");
		int n = str.length -1;
		System.out.println(str[n].length());
	}
}
