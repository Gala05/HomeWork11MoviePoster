package ru.netology;

import java.util.Arrays;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int limitMovies;

    public PosterManager() { //конструктор
        this.limitMovies = 10;
    }

    public PosterManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public Poster[] findAll() { //список фильмов в афише
        return posters;
    }

    public Poster[] addPosters(Poster newFilm) { // метод добавления фильма к афише

        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newFilm;
        posters = tmp;
        return posters;
    }

    public Poster[] findLast() { //вывод фильмов в порядке добавления
        Poster[] result;
        if (limitMovies > posters.length) {
            result = new Poster[posters.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = posters[posters.length - 1 - i];
            }
        } else {
            result = new Poster[limitMovies];
            for (int i = 0; i < result.length; i++) {
                result[i] = posters[posters.length - 1 - i];
            }
        }
        return result;
    }
}