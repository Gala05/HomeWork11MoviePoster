package ru.netology;

public class PosterManager {
    private PosterRepository repo;
    //private int limitMovies;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    /*public PosterManager() { //конструктор
        this.limitMovies = 10;
    }

    public PosterManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }*/

    public PosterRepository AllPosters() {
        repo.findAll();
        return repo;
    }

    public Poster[] add(Poster newMovie) {
        Poster[] poster = repo.save(newMovie);
        return poster;
    }

    public PosterRepository findPoster(int id) {
        repo.findById(id);
        return repo;
    }

    public PosterRepository removePoster(int item) {
        repo.removeById(item);
        return repo;
    }

    public PosterRepository removeAllPosters() {
        repo.removeAll();
        return null;
    }

    public Poster[] findLast() { //вывод фильмов в порядке добавления
        Poster[] all = repo.findAll();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    /*public Poster[] getLast() { //вывод фильмов в порядке добавления с лимитом
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
    }*/
}