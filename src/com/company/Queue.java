package com.company;

public interface Queue<T> {

    T push(T element);

    T pop();
}
