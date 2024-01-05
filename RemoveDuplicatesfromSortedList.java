public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode res = head;
        if(res!=null){
            if(res.val==res.next.val)
                res.next = deleteDuplicates(res.next.next);
            else
                res.next = deleteDuplicates(res.next);
        }
        return head;
    }
}
