package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTestWithMockito {
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);
    Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
    Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
    Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");

    @Test
    public void findAllTest() { // вывод всех фильмов по списку
        Poster[] movies = {movie1, movie2, movie3};

        doReturn(movies).when(repo).findAll();
        Poster[] expected = movies;
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        Poster[] movies = {movie1, movie2, movie3};

        doReturn(movies).when(repo).findAll();
        Poster[] expected = {movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}