package leetCode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers two = new AddTwoNumbers();
		ListNode obj = new ListNode();
		ListNode obj2 = new ListNode();
		ListNode obj3 = new ListNode();
		ListNode obj4 = new ListNode();
		ListNode obj5 = new ListNode();
		ListNode obj6 = new ListNode();
		ListNode obj7 = new ListNode();
		obj.val = 2;
		obj2.val = 4;
		obj.next = obj2;
		obj3.val = 3;
		obj2.next = obj3;
		obj3.next = null;
		obj4.val = 5;
		obj5.val = 6;
		obj4.next = obj5;
		obj6.val = 4;
		obj5.next = obj6;
		obj6.next = null;
		obj7 = two.addTwoNumbers(obj, obj4);
		if(obj7!=null)
		{
			System.out.println(obj7.val);
			obj7 = obj7.next;
		}
	}
	
	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
		   int sum = 0;
		   ListNode p = l1;
		   ListNode q = l2;
		   int carry = 0;
		   ListNode result = new ListNode(0);
		   while(p != null || q != null)
		   {
			System.out.println(p.val);
			System.err.println(q.val);
			int n1 = p.val; 
			int n2 = q.val;
			sum = carry + n1 + n2;
			carry = sum / 10;
			result.next = new ListNode(sum % 10);
			System.out.println(result.val);
			result = result.next;
			if(p!=null)
				p = p.next;
			if(q != null)
				q = q.next;
		   }
		   
	        return result;
	    }
	 //supraja -  8925411178
}
