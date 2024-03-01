/*
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseList {
	public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode newHead = reverseList(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
