package com.mycodefu.bitsbytes;

import java.time.Instant;

public class TickSpeed {
    public static final int ITERATIONS = 999_000_000;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            loopForIterations(); //warmup
        }

        System.out.println("Started at " + Instant.now());
        long start = System.nanoTime();

        loopForIterations();

        long end = System.nanoTime();

        long time_taken_nanos = end - start;
        double time_taken_millis = time_taken_nanos / 1_000_000d;
        double time_taken_nanos_per_loop = time_taken_nanos / (double)ITERATIONS;

        System.out.printf(
                "Time taken millis: %.3f\n" +
                "Time per loop nanos: %.3f\n",
                time_taken_millis,
                time_taken_nanos_per_loop
        );

        System.out.println("Finished at " + Instant.now());
    }

    private static void loopForIterations() {
        long count = 0;
        while (count < ITERATIONS) {
            count++;
        }
    }


}
