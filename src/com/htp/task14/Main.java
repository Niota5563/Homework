package com.htp.task14;

import com.htp.task14.entity.Client;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 8; i++) {
            new Thread(new Client(i)).start();
            Thread.sleep(500);
        }
    }
}