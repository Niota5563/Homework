package com.htp.cinema;

public class Film {

    static class Body {

        private String name;
        private String genre;
        private String duration;
        private String about;


        Body(String name, String genre, String duration, String about) {
            this.name = name;
            this.genre = genre;
            this.duration = duration;
            this.about = about;
        }

        @Override
        public String toString() {
            return
                    "Название: " + name +
                            ", жанр: " + genre +
                            ", продолжительность: " + duration +
                            ", режиссер: " + about;
        }
    }

}
