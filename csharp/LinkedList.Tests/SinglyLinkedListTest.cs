namespace LinkedList.Singly.Tests;

using LinkedList.Singly;

public class SingleLinkedListTest
{
    [Fact]
    public void LengthShouldBeZero()
    {
        var result = new SinglyLinkedList();
        Assert.Equal((uint)0, result.length);
    }
}
