namespace LinkedList.Singly;

using System;
using System.Text;

public class Node<T>
{
    public T data;
    public Node<T>? next;

    public Node(T value)
    {
        data = value;
        next = null;
    }
}

public class SinglyLinkedList<T>
{
    public uint length;
    public Node<T>? head;
    public Node<T>? tail;

    public SinglyLinkedList()
    {
        length = 0;
        head = null;
    }

    public void Append(T value)
    {
        this.length += 1;
        var n = new Node<T>(value);

        if (this.head == null)
        {
            this.head = this.tail = n;
            return;
        }

        this.tail!.next = n;
        this.tail = n;
    }

    public void Pop()
    {
        if (this.head == null || this.tail == null)
        {
            return;
        }

        this.length -= 1;

        if (this.head == this.tail)
        {
            this.head = this.tail = null;
            return;
        }

        var current = this.head;

        while (current != null && current.next != this.tail)
        {
            current = current.next;
        }

        this.tail = current;
        if (this.tail != null)
        {
            this.tail.next = null;
        }
    }

    public override String ToString()
    {
        var current = this.head;
        StringBuilder s = new StringBuilder();

        while (current != null)
        {
            s.Append(current.data);
            if (current.next != null)
            {
                s.Append(" -> ");
            }

            current = current.next;
        }

        return s.ToString();
    }

}
