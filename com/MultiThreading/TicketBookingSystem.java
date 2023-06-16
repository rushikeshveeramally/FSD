package com.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {
    private int availableTickets;
    private Lock lock;

    public TicketBookingSystem(int totalTickets) {
        availableTickets = totalTickets;
        lock = new ReentrantLock();
    }

    public boolean bookTicket(int numTickets) {
        lock.lock(); // Acquire the lock

        try {
            if (availableTickets >= numTickets) {
                // Simulating some delay in the booking process
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Book the tickets
                System.out.println(Thread.currentThread().getName() + " booked " + numTickets + " tickets.");
                availableTickets -= numTickets;
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to book tickets.");
                return false;
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public static void main(String[] args) {
        int totalTickets = 10;
        TicketBookingSystem bookingSystem = new TicketBookingSystem(totalTickets);

        // Create multiple threads to book tickets concurrently
        Thread thread1 = new Thread(() -> bookingSystem.bookTicket(3));
        Thread thread2 = new Thread(() -> bookingSystem.bookTicket(4));
        Thread thread3 = new Thread(() -> bookingSystem.bookTicket(2));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
