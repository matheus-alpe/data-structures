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
