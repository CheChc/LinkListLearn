class LinkedListNode
{
    int val;
    LinkedListNode next;

    LinkedListNode()
    {
    }

    LinkedListNode(int val)
    {
        this.val = val;
    }
}

class MyLinkedList
{
    int size;//链表元素的个数
    LinkedListNode head;//虚拟头节点

    public MyLinkedList()
    {
        size = 0;
        head = new LinkedListNode(0);
    }

    public int get(int index)
    {
        if (index < 0 || index >= size)
            return -1;
        LinkedListNode cur = head;
        for (int i = 0; i <= index; i++)
        {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val)
    {
        addAtIndex(0, val);
    }

    public void addAtTail(int val)
    {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val)
    {
        if (index > size)
            return;
        if (index < 0)
        {
            index = 0;
        }
        size++;
        LinkedListNode li = new LinkedListNode(val);
        LinkedListNode cur = head;
        for (int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        li.next = cur.next;
        cur.next = li;

    }

    public void deleteAtIndex(int index)
    {
        if (index < 0 || index >= size)
            return;
        size--;
        if (index == 0)
        {
            head = head.next;
        }
        LinkedListNode cur = head;
        for (int i = 0; i < index; i++)
        {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }

    public void print()
    {
        LinkedListNode cur = head;
        for (int i = 0; i < size; i++)
        {
            cur = cur.next;
            System.out.println(cur.val);
        }
    }

    public static void main(String[] args)
    {
        MyLinkedList ml = new MyLinkedList();
        ml.addAtHead(1);
        ml.addAtTail(2);
        ml.addAtHead(3);
        ml.addAtIndex(1, 4);
        ml.print();
    }
}
