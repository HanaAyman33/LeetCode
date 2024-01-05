public class AddNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		String n1 = "",n2 = "";
        while(l1!=null) {
        	n1 = l1.val+""+n1;
        	l1 = l1.next;
        }
        while(l2!=null) {
        	n2 = l2.val+""+n2;
        	l2 = l2.next;
        }
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int res = num1+num2;
        ListNode result = new ListNode(res%10);
        res/=10;
        while(res!=0){
            result.next = new ListNode((Integer)(res%10));
        	res/=10;
        }
        return result;
        /*	Another solution=>each digit taken consecutively
         *  ListNode dummyHe	ad = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
        */
    }
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
