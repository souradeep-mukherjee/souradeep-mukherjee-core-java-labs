package com.souradeep.lab9.concurrent.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        ExecutorService service =
                Executors.newSingleThreadExecutor();

        service.execute(() -> {

            try {

                while (true) {
                    System.out.println("Timer: "
                            + java.time.LocalTime.now());

                    Thread.sleep(10000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        service.shutdown();
    }
}