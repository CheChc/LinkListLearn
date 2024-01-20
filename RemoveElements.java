import java.util.Scanner;

public class RemoveElements
{
    public ListNode removeElements(ListNode head, int val)
    {
        while (head != null && head.val == val)
        {
            head = head.next;
        }
        if (head == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null)
        {
            if (cur.val == val)
            {
                pre.next = cur.next;
            } else
            {
                pre = cur;
            }
            cur = cur.next;
        }
        return pre;
    }

    public static void main(String[] args)
    {
        System.out.println("请输入链表，输入-1截止");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ListNode head = null;
        ListNode current = null;
        while (i != -1)
        {
            ListNode li = new ListNode(i);
            if (head == null)
            {
                head = li;
                current = li;
            } else
            {
                current.next = li;
                current = li;
            }
            i = sc.nextInt();
        }
        current = head;
        while (current != null)
        {
            System.out.print(current.val + " "); // 打印当前节点的值
            current = current.next; // 移动到下一个节点
        }

        System.out.println(); // 换行
        RemoveElements rm = new RemoveElements();
        System.out.println("请输入想删除的值");
        int target = sc.nextInt();
        ListNode num = rm.removeElements(head, target);
        sc.close();
        current = head;
        while (current != null)
        {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
