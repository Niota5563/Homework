package com.htp.fourthday.entity;

import java.util.Comparator;

public class TransportComparator implements Comparator<Transport> {
    public int compare(Transport o1, Transport o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
