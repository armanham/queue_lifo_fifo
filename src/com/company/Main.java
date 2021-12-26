package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Queue<String> lifoQueue = new LifoQueue<>();

        lifoQueue.push("Arman");
        lifoQueue.push("Armann");
        lifoQueue.push("Armannn");
        lifoQueue.push("Armannnn");
        lifoQueue.push("Armannnnn");

        lifoQueue.pop();
        lifoQueue.pop();

        System.out.println(lifoQueue.toString());


        Queue<Integer> fifoQueue = new FifoQueue<>();

        fifoQueue.push(1);
        fifoQueue.push(2);
        fifoQueue.push(3);
        fifoQueue.push(4);
        fifoQueue.push(5);
        fifoQueue.push(6);

        fifoQueue.pop();
        fifoQueue.pop();

        System.out.println(fifoQueue.toString());
    }
}
