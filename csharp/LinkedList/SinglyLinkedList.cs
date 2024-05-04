namespace LinkedList.Singly;

using System;

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

    public SinglyLinkedList()
    {
        length = 0;
        head = null;
    }

    public void Append(T value)
    {
        throw new NotImplementedException("Not implemented.");
    }

    public void Remove()
    {
        throw new NotImplementedException("Not implemented.");
    }
}
