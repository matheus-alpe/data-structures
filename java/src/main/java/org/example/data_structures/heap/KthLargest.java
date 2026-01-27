package org.example.data_structures.heap;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
public class KthLargest {
    private final int[] heap;
    private final int capacity;
    private int size;

    public KthLargest(int k, int[] nums) {
        this.capacity = k;
        this.size = 0;
        this.heap = new int[capacity];

        for (int num : nums) {
            add(num);
        }

    }

    public int add(int val) {
        if (size < capacity) {
            heap[size] = val;
            size++;
            heapifyUp(size - 1);
        } else if (val > heap[0]) {
            heap[0] = val;
            heapifyDown(0);
        }
        return heap[0];

    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = parent(index);
            if (heap[index] < heap[parentIndex]) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }


    private void heapifyDown(int index) {
        while (index < size) {
            int leftChildIndex = leftChild(index);
            int rightChildIndex = rightChild(index);
            int smallestIndex = index;

            if (leftChildIndex < size && heap[leftChildIndex] < heap[smallestIndex]) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex < size && heap[rightChildIndex] < heap[smallestIndex]) {
                smallestIndex = rightChildIndex;
            }
            if (smallestIndex != index) {
                swap(index, smallestIndex);
                index = smallestIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        heap[i] ^= heap[j];
        heap[j] ^= heap[i];
        heap[i] ^= heap[j];
    }
}
