package com.htp.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    public static void main(String[] args) {


        List<Film.Body> films = new ArrayList<>();
        films.add(new Film.Body("Титаник", "Драма/Фильм-катастрофа", "3ч 15 мин", "Джеймс Кэмерон"));
        films.add(new Film.Body("Хатико: самый верный друг", "Драма/Семейный", "1ч 33 мин", "Лассе Халльстрём"));

        films.forEach(System.out::println);
    }


}
