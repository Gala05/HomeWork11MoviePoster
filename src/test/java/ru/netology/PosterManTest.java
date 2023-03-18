package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManTest {
    @Test
    public void getPostersInReverseAll() { //вывод всех фильмов в обратном порядке
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Poster[] expected = { movie5, movie4, movie3, movie2, movie1 };
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test() { //вывод всех по списку
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(05, "film5", "horror", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Poster[] expected = {movie3};
        Poster[] actual = new Poster[]{repo.finedById(3)};

        Assertions.assertArrayEquals(expected, actual);
    }
}