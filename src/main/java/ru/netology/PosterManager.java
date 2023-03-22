package ru.netology;

public class PosterManager {
    private PosterRepository repo;

    public PosterRepository getRepo() {
        return repo;
    }

    public void setRepo(PosterRepository repo) {
        this.repo = repo;
    }

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
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

    public Poster[] findLast() { //вывод фильмов в порядке добавления
        Poster[] tmp = repo.getLast();
        return tmp;
    }
}