import java.util.LinkedList;
import java.util.Scanner;

public class LinkEg
{
    public static void main(String[] args)
    {
//        LinkedList li = new LinkedList();
//        li.addFirst(1);
//        System.out.println(li.getFirst());
//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(2,one);
        Scanner scanner = new Scanner(System.in);
        ListNode head = null;
        ListNode current = null;

        System.out.println("请输入整数（输入-1结束输入）：");
        int num = scanner.nextInt();

        while (num != -1)
        {
            ListNode newNode = new ListNode(num);

            if (head == null)
            {
                head = newNode;
                current = newNode;
            } else
            {
                current.next = newNode;
                current = newNode;
            }

            num = scanner.nextInt();
        }

        scanner.close();
        //ListNode current = head; 假设 head 是链表的头节点

        while (current != null)
        {
            System.out.print(current.val + " "); // 打印当前节点的值
            current = current.next; // 移动到下一个节点
        }

        System.out.println(); // 换行
    }
}
