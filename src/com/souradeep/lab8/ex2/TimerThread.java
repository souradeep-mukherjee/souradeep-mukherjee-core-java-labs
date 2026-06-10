package com.souradeep.lab8.ex2;

public class TimerThread implements Runnable {

    @Override
    public void run() {

        try {

            while (true) {
                System.out.println("Timer: "
                        + java.time.LocalTime.now());

                Thread.sleep(10000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new TimerThread());
        thread.start();
    }
}