package ru.netology;

public class PosterManager {
    private PosterRepository repo;
    private int limitMovies;

    public PosterRepository getRepo() {
        return repo;
    }

    public void setRepo(PosterRepository repo) {
        this.repo = repo;
    }

    public int getLimitMovies() {
        return limitMovies;
    }

    public void setLimitMovies(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
        limitMovies = 10;
    }

    public PosterManager(PosterRepository repo, int limitMovies) {
        this.repo = repo;
        this.limitMovies = limitMovies;
    }

    public Poster[] AllPosters() {
        Poster[] tmp = repo.findAll();
        return tmp;
    }

    public void add(Poster newMovie) {
        repo.save(newMovie);
    }

    public Poster[] findPoster(int id) {
        Poster[] tmp = repo.findById(id);
        return tmp;
    }

    public void removePoster(int id) {
        repo.removeById(id);
    }

    public void removeAllPosters() {
        repo.removeAll();
    }

    public Poster[] findLast() { //вывод фильмов в порядке добавления с лимитом
        int resultLength = 0;
        if (limitMovies > AllPosters().length) {
            resultLength = AllPosters().length;
        } else {
            resultLength = limitMovies;
        }
        Poster[] tmp = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = AllPosters()[AllPosters().length - 1 - i];
        }
        return tmp;
    }
//    public Poster[] findLast() { //вывод фильмов в порядке добавления
//        Poster[] tmp = repo.getLast();
//        return tmp;
//    }
}