package ru.netology;

public class PosterManager {
    private PosterRepository post;
    private int limitMovies;

    public PosterManager(PosterRepository post) {
        this.post = post;
    }

    public PosterManager() { //конструктор
        this.limitMovies = 10;
    }

    public PosterManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public PosterRepository AllPosters() {
        post.findAll();
        return post;
    }

    public void add(Poster newMovie) {
        post.save(newMovie);
    }

    public PosterRepository findPoster(int item) {
        post.finedById(item);
        return post;
    }

    public PosterRepository removePoster(int item) {
        post.removeById(item);
        return post;
    }

    public PosterRepository removeAllPosters() {
        post.removeAll();
        return null;
    }

    public Poster[] findLast() { //вывод фильмов в порядке добавления
        Poster[] all = post.findAll();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Poster[] getLast() { //вывод фильмов в порядке добавления
        Poster[] all = post.findAll();
        Poster[] reversed = new Poster[all.length];
        int resultLength = 0;
        if (limitMovies > all.length) {
            resultLength = all.length;
        } else {
            resultLength = limitMovies;
        }
        Poster[] tmp = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = all[all.length - 1 - i];
        }
        return tmp;
    }
}