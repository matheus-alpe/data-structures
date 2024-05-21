namespace LinkedList.Singly.Tests;

using LinkedList.Singly;

public class SingleLinkedListTest
{
    [Fact]
    public void LengthShouldBeZero()
    {
        var result = new SinglyLinkedList<int>();
        Assert.Equal((uint)0, result.length);
    }

    [Fact]
    public void LengthShouldBeGreaterThanZero()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        Assert.NotEqual((uint)0, result.length);
    }

    [Fact]
    public void ShouldAddAndPrintCorrectly()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        Assert.Equal("10", result.ToString());
    }

    [Fact]
    public void ShouldBeAppendInRightOrder()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);
        Assert.Equal("10 -> 20 -> 30", result.ToString());
        Assert.Equal((uint)3, result.length);
    }

    [Fact]
    public void ShouldBePrependInRightOrder()
    {
        var result = new SinglyLinkedList<int>();
        result.Prepend(10);
        result.Prepend(20);
        result.Prepend(30);
        Assert.Equal("30 -> 20 -> 10", result.ToString());
        Assert.Equal((uint)3, result.length);
    }

    [Fact]
    public void ShouldBePrependAndAppendInRightOrder()
    {
        var result = new SinglyLinkedList<int>();
        result.Prepend(10);
        result.Prepend(20);
        result.Append(30);
        Assert.Equal("20 -> 10 -> 30", result.ToString());
        Assert.Equal((uint)3, result.length);
    }

    [Fact]
    public void ShouldInsertAtZero()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(30);
        result.InsertAt(0, 20);
        Assert.True(result.Has(20));
        Assert.Equal("20 -> 30", result.ToString());
        Assert.Equal((uint)2, result.length);
    }

    [Fact]
    public void ShouldInsertAtOne()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(30);
        result.InsertAt(1, 20);
        Assert.True(result.Has(20));
        Assert.Equal("30 -> 20", result.ToString());
        Assert.Equal((uint)2, result.length);
    }

    [Fact]
    public void ShouldInsertAt_IndexOutOfRangeException()
    {
        var result = new SinglyLinkedList<int>();
        Assert.Throws<System.IndexOutOfRangeException>(() => result.InsertAt(1, 20));
    }

    [Fact]
    public void ShouldInsertAtSpecificPosition()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.InsertAt(1, 30);
        Assert.Equal("10 -> 30 -> 20", result.ToString());
    }

    [Fact]
    public void ShouldInsertAtOrder()
    {
        var result = new SinglyLinkedList<int>();
        result.InsertAt(0, 10);
        result.InsertAt(1, 20);
        result.InsertAt(2, 30);
        Assert.Equal("10 -> 20 -> 30", result.ToString());
    }

    [Fact]
    public void ShouldRemoveFirstValue()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);
        result.Shift();
        Assert.Equal("20 -> 30", result.ToString());
        Assert.Equal((uint)2, result.length);
    }

    [Fact]
    public void ShouldRemoveLastValue()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);
        result.Pop();
        Assert.Equal("10 -> 20", result.ToString());
        Assert.Equal((uint)2, result.length);
    }

    [Fact]
    public void ShouldBeEmptyOnRemoveLast()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Pop();
        Assert.Equal("", result.ToString());
        Assert.Equal((uint)0, result.length);
    }

    [Fact]
    public void ShouldDeleteAtZero()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(30);
        result.DeleteAt(0);
        Assert.False(result.Has(30));
        Assert.Equal("", result.ToString());
        Assert.Equal((uint)0, result.length);
    }

    [Fact]
    public void ShouldDeleteAtOne()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(30);
        result.InsertAt(1, 20);
        result.DeleteAt(1);
        Assert.False(result.Has(20));
        Assert.Equal("30", result.ToString());
        Assert.Equal((uint)1, result.length);
    }

    [Fact]
    public void ShouldDeleteAt_IndexOutOfRangeException()
    {
        var result = new SinglyLinkedList<int>();
        Assert.Throws<System.IndexOutOfRangeException>(() => result.DeleteAt(0));
    }

    [Fact]
    public void ShouldDeleteAtSpecificPosition()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);

        result.DeleteAt(1);
        Assert.Equal("10 -> 30", result.ToString());
    }

    [Fact]
    public void ShouldDeleteAtOrder()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);

        result.DeleteAt(0);
        Assert.Equal("20 -> 30", result.ToString());

        result.DeleteAt(0);
        Assert.Equal("30", result.ToString());

        result.DeleteAt(0);
        Assert.Equal("", result.ToString());

        Assert.Equal((uint)0, result.length);

    }

    [Fact]
    public void ShouldReturnFalseOnEmptySearch()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        Assert.False(result.Has(30));
        Assert.Equal((uint)2, result.length);
    }

    [Fact]
    public void ShouldReturnTrueOnSearch()
    {
        var result = new SinglyLinkedList<int>();
        result.Append(10);
        result.Append(20);
        result.Append(30);
        Assert.True(result.Has(20));
        Assert.Equal((uint)3, result.length);
    }
}
