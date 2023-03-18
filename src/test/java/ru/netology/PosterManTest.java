package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManTest {// тесты метода findLast
    @Test
    public void findLastAll() { //вывод последних 10 добавленных фильмов из 10 с конструктором без параметров
        PosterManager post = new PosterManager();
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
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);
        post.addPosters(movie6);
        post.addPosters(movie7);
        post.addPosters(movie8);
        post.addPosters(movie9);
        post.addPosters(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Test() { //вывод последних 10 добавленных фильмов из 12 с конструктором без параметров
        PosterManager post = new PosterManager();
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
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);
        post.addPosters(movie6);
        post.addPosters(movie7);
        post.addPosters(movie8);
        post.addPosters(movie9);
        post.addPosters(movie10);
        post.addPosters(movie11);
        post.addPosters(movie12);

        Poster[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10NotEnoughWithoutParametersTest() { //последние 10 фильмов из 5
        PosterManager post = new PosterManager();
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);

        Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10NotEnoughTest() { //вывод последних 10 фильмов из 8
        PosterManager post = new PosterManager(7);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);

        Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getPostersInReverseWithLimitTest1() { //тест конструктора
        PosterManager post = new PosterManager(8);
        Poster movie1 = new Poster(1, "film1", "animated film", "imageUrl1");
        Poster movie2 = new Poster(2, "film2", "action movie", "imageUrl2");
        Poster movie3 = new Poster(3, "film3", "comedy", "imageUrl3");
        Poster movie4 = new Poster(4, "film4", "horror", "imageUrl4");
        Poster movie5 = new Poster(5, "film5", "animated film", "imageUrl5");
        Poster movie6 = new Poster(6, "film6", "action movie", "imageUrl6");
        Poster movie7 = new Poster(7, "film7", "comedy", "imageUrl7");
        Poster movie8 = new Poster(8, "film8", "horror", "imageUrl8");
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);
        post.addPosters(movie6);
        post.addPosters(movie7);
        post.addPosters(movie8);

        Poster[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void getPostersInReverseAll1() { //вывод всех фильмов в обратном порядке
        PosterManager post = new PosterManager(5);
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
        post.addPosters(movie1);
        post.addPosters(movie2);
        post.addPosters(movie3);
        post.addPosters(movie4);
        post.addPosters(movie5);
        post.addPosters(movie6);
        post.addPosters(movie7);
        post.addPosters(movie8);
        post.addPosters(movie9);
        post.addPosters(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6};
        Poster[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}