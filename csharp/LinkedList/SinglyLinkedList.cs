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

    public void Prepend(T value)
    {
        this.length += 1;
        var n = new Node<T>(value);

        if (this.head == null)
        {
            this.head = this.tail = n;
            return;
        }

        n.next = this.head;
        this.head = n;
    }

    public void InsertAt(uint index, T value)
    {
        if (index > this.length)
        {
            throw new IndexOutOfRangeException();
        }

        this.length += 1;
        var n = new Node<T>(value);

        if (this.head == null)
        {
            this.head = this.tail = n;
            return;
        }

        var current = this.head;
        for (int i = 1; i < index && current != null && current.next != null; i++)
        {
            current = current.next;
        }

        n.next = current!.next;
        current.next = n;
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

    public bool Has(T target)
    {
        var current = this.head;

        while (current != null && current.data != null)
        {
            if (current.data.Equals(target))
            {
                return true;
            }

            current = current.next;
        }

        return false;
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
