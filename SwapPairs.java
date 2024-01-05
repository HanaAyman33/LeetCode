public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if(head==null || head.next==null)
            return head;
        ListNode start = new ListNode();
        start.next = head;
        ListNode curr = start;
        while(curr.next.next!=null){
            ListNode tmp = curr.next;
            ListNode tmp2 =curr.next.next;
            tmp.next = curr;
            curr = curr.next.next;
            curr.next = tmp2;
        }
        return start.next;
    }
	/*
	 * if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }
        
        return dummy.next;

	 */
}
