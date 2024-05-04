namespace LinkedList.Singly;

using System;

public class Node
{
    public int data;
    public Node? next;

    public Node(int d)
    {
        data = d;
        next = null;
    }
}

public class SinglyLinkedList
{
    public uint length;
    public Node? head;

    public SinglyLinkedList()
    {
        length = 0;
        head = null;
    }

    public void Append(int value)
    {
        throw new NotImplementedException("Not implemented.");
    }

    public void Remove(int index)
    {
        throw new NotImplementedException("Not implemented.");
    }
}
