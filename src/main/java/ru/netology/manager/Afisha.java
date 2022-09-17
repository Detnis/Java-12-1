package ru.netology.manager;

public class Afisha {
    // переменные
    private String[] movies = new String[0];
    private int lemit;

    //конструкторы
    public Afisha() {
        lemit = 10;
    }

    public Afisha(int lemit) {
        this.lemit = lemit;
    }

    //методы
    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int lengt;
        if (movies.length < lemit) {
            lengt = movies.length;
        } else {
            lengt = lemit;
        }
        String[] tmp = new String[lengt];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - i - 1];
        }
        return tmp;
    }
}
