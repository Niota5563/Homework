package com.htp.ThirdDay;

public class Bus {
    private String number;
    private int route;
    private String mark;
    private String date;
    private double mileage;

    public String toString() {
        return "Номер автобуса: " + number +
                ", номер маршрута: " + route +
                ", марка: " + mark +
                ", год начала эксплуатации: " + date +
                ", пробег: " + mileage + " км";
    }

    public Bus(String number, int route, String mark, String date, double mileage) {
        this.number = number;
        this.route = route;
        this.mark = mark;
        this.date = date;
        this.mileage = mileage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

  public static void search (Bus[] array, int route)
  {
      int number = 0;
      for (Bus t: array) {
          if (t.getRoute() == 1)
          {
              System.out.println(t);
              number++;
          }

      }
  }

}
//Номер автобуса, Номер маршрута,
//	Марка, Год начала эксплуатации, Пробег.