package com.itmo.sync;

public class Bank {
    private int to;
    private int from = 220;

    public synchronized void calc(int transaction, long timeout) {
        System.out.println("Before: to = " + to + ", from: " + from + ", thread: " + Thread.currentThread().getName());
        from -= transaction;
        try {
            Thread.sleep(timeout);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        to += transaction;
        System.out.println("After: to = " + to + ", from: " + from + ", thread: " + Thread.currentThread().getName());
    }
}
