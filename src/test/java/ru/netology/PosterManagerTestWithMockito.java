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
    Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
    Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
    Poster movie6 = new Poster(6, "film6", "action movie", "imageUrl6");
    Poster movie7 = new Poster(7, "film7", "comedy", "imageUrl7");
    Poster movie8 = new Poster(8, "film8", "horror", "imageUrl8");
    Poster movie9 = new Poster(9, "film9", "horror", "imageUrl9");
    Poster movie10 = new Poster(10, "film10", "horror", "imageUrl10");

    @Test
    public void findAllTest() { // вывод всех фильмов по списку
        Poster[] movies = { movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10 };

        doReturn(movies).when(repo).findAll();
        Poster[] expected = movies;
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() { // возврат объекта по идентификатору
        Poster[] movies = { movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10 };

        doReturn(movies).when(repo).findAll();
        Poster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}