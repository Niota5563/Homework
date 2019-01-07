package com.htp.task14.entity;

import java.util.concurrent.Semaphore;

public class Client implements Runnable {

    private int clientNumber;

    public Client(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    private static final boolean[] OPERATOR = new boolean[4];
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);


    @Override
    public void run() {
        System.out.println("Клиент " + clientNumber + " ожидает ответа оператора");
        try {
            SEMAPHORE.acquire();

            int operatorNumber = -1;

            synchronized (OPERATOR) {
                for (int i = 1; i < 4; i++)
                    if (!OPERATOR[i]) {
                        OPERATOR[i] = true;
                        operatorNumber = i;
                        System.out.println("Клиент " + this.clientNumber + " разговаривает с оператором " + i);
                        break;
                    }
            }

            Thread.sleep(5000);

            synchronized (OPERATOR) {
                OPERATOR[operatorNumber] = false;
            }

            SEMAPHORE.release();
            System.out.println("Клиент " + this.clientNumber + " закончил разговор");
        } catch (Exception e) {
            System.out.println();
        }
    }
}

