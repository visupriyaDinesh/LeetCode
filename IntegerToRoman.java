package leetCode;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =27;
		StringBuffer ans= new StringBuffer();
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};


        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num=num-value[i];
                ans.append(symbol[i]);
            }
        }
       System.out.println(ans.toString());

		
	}

}
