public class RemoveFromEnd
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead, slow = dummyHead;
        for (int i = 0; i <= n && fast != null; i++)
        {
            fast = fast.next;
        }
        while (fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
