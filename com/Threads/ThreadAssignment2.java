package com.Threads;

public class ThreadAssignment2 implements Runnable{
    @Override 
    public void run() {
        for (int i=0;i<=10;i++){
             System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadAssignment2 thread2 =new ThreadAssignment2();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}
