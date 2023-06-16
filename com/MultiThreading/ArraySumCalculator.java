package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArraySumCalculator {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];

    public static void main(String[] args) {
        // Initialize the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        // Create a fixed thread pool with the desired number of threads
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        // Calculate the size of each partition
        int partitionSize = ARRAY_SIZE / THREAD_COUNT;

        // Submit each partition to a separate thread
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * partitionSize;
            int endIndex = (i + 1) * partitionSize;
            executor.submit(new PartialSumCalculator(startIndex, endIndex, i));
        }

        // Shutdown the executor and wait for all tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine the partial sums to get the final sum
        int sum = 0;
        for (int partialSum : partialSums) {
            sum += partialSum;
        }

        System.out.println("Sum of array elements: " + sum);
    }

    private static class PartialSumCalculator implements Runnable {
        private int startIndex;
        private int endIndex;
        private int threadIndex;

        public PartialSumCalculator(int startIndex, int endIndex, int threadIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
            partialSums[threadIndex] = partialSum;
        }
    }
}
