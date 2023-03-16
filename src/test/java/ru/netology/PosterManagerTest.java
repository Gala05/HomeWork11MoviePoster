package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    Poster posters = new Poster();
    PosterManager pm = new PosterManager();
    Poster movie1 = new Poster(01, "film1", "animated film", "imageUrl1");
    Poster movie2 = new Poster(02, "film2", "action movie", "imageUrl2");
    Poster movie3 = new Poster(03, "film3", "comedy", "imageUrl3");
    Poster movie4 = new Poster(04, "film4", "horror", "imageUrl4");

    @BeforeEach
    public void setup() {
        pm.addPosters(movie1);
        pm.addPosters(movie2);
        pm.addPosters(movie3);
        pm.addPosters(movie4);
    }

    @Test
    public void testGetPosters() { //вывод всех фильмов в афише

        Poster[] expected = {movie1, movie2, movie3, movie4};
        Poster[] actual = pm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd() { // проверка добавления нового фильма к афише фильмов
        Poster movie5 = new Poster(05, "film5", "horror", "imageUrl5");
        pm.addPosters(movie5);
        Poster[] expected = {movie1, movie2, movie3, movie4, movie5};
        Poster[] actual = pm.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetPostersInReverse() { // //последние добавленные фильмы

        Poster[] expected = {movie4, movie3, movie2, movie1};
        Poster[] actual = pm.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}