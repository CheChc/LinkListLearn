public class DeleteCycle
{
    public ListNode detectCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        boolean is_cycle = false;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
            {
                is_cycle = true;
                break;
            }
        }
        if (!is_cycle)
            return null;
        else
        {
            ListNode indexhead = head;
            ListNode indexmeet = slow;
            while (indexhead != indexmeet)
            {
                indexhead = indexhead.next;
                indexmeet = indexmeet.next;
            }
            return indexhead;
        }
    }
}
