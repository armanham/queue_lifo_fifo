package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class LifoQueue<T> implements Queue<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public T push(T element) {
        linkedList.add(element);
        return element;
    }

    @Override
    public T pop() {
        return linkedList.pollLast();
    }

    @Override
    public String toString() {
        return "LifoQueue{" +
                "linkedList=" + Arrays.toString(new LinkedList[]{linkedList}) +
                '}';
    }
}
