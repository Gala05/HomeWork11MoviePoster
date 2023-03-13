package ru.netology;

import java.util.Arrays;

public class PosterManager {
    public Poster[] posters = new Poster[0];

    public PosterManager() { //конструктор

    }

//    public PosterManager(int limitMovies) { //конструктор
//
//    }

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
        return tmp;
    }

    public Poster[] findLastAll() { //все последние добавленные фильмы

        Poster[] reversed = new Poster[posters.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }

    public Poster[] findLast10() { //последние 10 добавленных фильмов
        int resultLength = 10;

        Poster[] reversed = new Poster[posters.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        Poster[] end = Arrays.copyOf(reversed, resultLength);

        return end;
    }

    public Poster[] findLastWithLimit(int limitMovies) { //последние добавленные фильмы с выставленным лимитом
        int resultLength;
        if (limitMovies < posters.length) {
            resultLength = limitMovies;
        } else {
            resultLength = posters.length;
        }

        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}