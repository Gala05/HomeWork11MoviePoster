package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManTest {
    @Test
    public void AllPostersTest() { //вывод всех фильмов по порядку
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

        Poster[] expected = { movie1, movie2, movie3, movie4, movie5 };
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTest() { //сохранение фильма
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

        Poster[] expected = { movie1, movie2, movie3, movie4, movie5 };
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findPosterTest() {
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "horror", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Poster[] expected = {movie3};
        Poster[] actual = manager.findPoster(movie3.getId());

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findPosterTestNegative() {
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "horror", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Poster[] expected = {null};
        Poster[] actual = manager.findPoster(6);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void removePosterTest() {
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "horror", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.removePoster(movie3.getId());

        Poster[] expected = { movie1, movie2, movie4, movie5 };;
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void removeAll() {
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "horror", "imageUrl5");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.removeAllPosters();
        Poster[] expected = {};
        Poster[] actual = manager.AllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastAll() { //вывод последних 10 добавленных фильмов из 10 с конструктором без параметров
        PosterRepository repo = new PosterRepository();
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Test() { //вывод последних 10 добавленных фильмов из 12 с конструктором без параметров
        PosterRepository repo = new PosterRepository();
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
        Poster movie11 = new Poster(11, "film11", "horror", "imageUrl11");
        Poster movie12 = new Poster(12, "film12", "horror", "imageUrl12");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);

        Poster[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10NotEnoughWithoutParametersTest() { //последние 10 фильмов из 5
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

        Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNotEnoughTest() { //вывод 7 фильмов из 5 с параметром
        PosterRepository repo = new PosterRepository(7);
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

        Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastInReverseWithLimitAll() { //вывод 8 фильмов из 8
        PosterRepository repo = new PosterRepository(8);
        PosterManager manager = new PosterManager(repo);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
        Poster movie6 = new Poster(6, "film6", "action movie", "imageUrl6");
        Poster movie7 = new Poster(7, "film7", "comedy", "imageUrl7");
        Poster movie8 = new Poster(8, "film8", "horror", "imageUrl8");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);

        Poster[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastInReverseWithParam() { //вывод 5 фильмов из 10
        PosterRepository repo = new PosterRepository(5);
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
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}