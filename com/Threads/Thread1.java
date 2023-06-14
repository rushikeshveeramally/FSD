package com.Threads;

public class Thread1 extends Thread{
    public void run(){
        for  (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Thread1 thread1 =new Thread1();
        thread1.start();
    }
}
