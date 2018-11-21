package com.htp.thirdday;


public class Stop {
    public static void main(String[] args) {
        Bus[] bus = new Bus[4];
        bus[0] = new Bus("111we1", 1, "ГАЗ", "10.08.2000", 200);
        bus[1] = new Bus("112we1", 1, "ПАЗ", "06.03.2002", 500);
        bus[2] = new Bus("222we2", 2, "ЛиАЗ", "17.04.2005", 300);
        bus[3] = new Bus("333we3", 3, "ГолАЗ", "28.10.2005", 400);

        System.out.println("Список автобусов для первого маршрута: ");

        for (Bus b : bus) {
            if (b.getRoute() == 1) {
                System.out.println(b);
            }
        }

        System.out.println("\nСписок автобусов, которые эксплуатируются с 2005 года: ");

        for (Bus a : bus) {
            if (a.getDate().contains("2005")) {
                System.out.println(a);
            }
        }

        System.out.println("\nСписок автобусов, пробег у которых больше или равен 300 км: ");

        for (Bus c: bus) {
            if (c.getMileage() >= 300)
            {
                System.out.println(c);
            }
        }

    }

}
