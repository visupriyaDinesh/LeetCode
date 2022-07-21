package leetCode;

public class ReverseInt {
	
	public static void main(String[] args) {
		
	
	int x = 1534236469;
	int result = 0;
    int y = 0;
    while(x!=0)
    {
        y = x % 10;
        result = (result*10) + y;
        x = x / 10; 
        if((Integer.MAX_VALUE/10 < result)||((Integer.MAX_VALUE/10 < result) && y > 7)|| 
        		Integer.MIN_VALUE/10 > result ||(Integer.MIN_VALUE/10 > result) && y < -8)
        {
           System.out.println("0");
           break;
        }
    }
    System.out.println(result);
    }
}

