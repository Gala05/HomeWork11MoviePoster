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

    @Test
    public void findAllPostersTest() {
        Poster[] movies = { movie1, movie2, movie3, movie4 };

        doReturn(movies).when(repo).findAll();
        PosterRepository expected = repo;
        PosterRepository actual = manager.AllPosters();

        Assertions.assertEquals(expected, actual);
    }
}