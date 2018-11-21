package com.htp.thirdday;

public class Driver {
    private String name;
    private String initial;

public Driver (String name, String initial)
{
    this.name = name;
    this.initial = initial;
}

public String getName () {
    return name;
}

public void setName(String name) {
    this.name = name;
}

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }


}

//Фамилия и инициалы водителя