package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class FifoQueue<T> implements Queue<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public T push(T element) {
        linkedList.add(element);
        return element;
    }

    @Override
    public T pop() {
        return linkedList.pollFirst();
    }

    @Override
    public String toString() {
        return "FifoQueue{" +
                "linkedList=" + Arrays.toString(new LinkedList[]{linkedList}) +
                '}';
    }
}
