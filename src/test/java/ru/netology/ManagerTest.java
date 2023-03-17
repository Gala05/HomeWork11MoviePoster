package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Poster movie1 = new Poster(01, "film1", "animated film", "imageUrl1");
    Poster movie2 = new Poster(02, "film2", "action movie", "imageUrl2");
    Poster movie3 = new Poster(03, "film3", "comedy", "imageUrl3");
    Poster movie4 = new Poster(04, "film4", "horror", "imageUrl4");

    @Test
    public void test() { //вывод всех по списку
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        Poster[] expected = {movie1, movie2, movie3, movie4};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void saveTest() { //вывод всех по списку
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        Poster movie5 = new Poster(05, "film5", "horror", "imageUrl5");
        repo.save(movie5);
        Poster[] expected = {movie1, movie2, movie3, movie4, movie5};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void fineByIdTest() { //найти по Id
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        Poster expected = movie3;
        Poster actual = repo.fineById(3);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void fineByIdNoObjectTest() { //найти по Id, если такого объекта нет
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        Poster expected = null;
        Poster actual = repo.fineById(5);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest() { //удалить по Id
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.removeById(3);

        Poster[] expected = {movie1, movie2, movie4};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void removeAllTest() { //очистить репозиторий
        PosterRepository repo = new PosterRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        Poster[] expected = {};
        Poster[] actual = repo.removeAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}