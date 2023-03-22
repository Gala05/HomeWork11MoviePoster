package ru.netology;

public class PosterRepository {
    private Poster[] posters = new Poster[0];

    private int limitMovies;

    public Poster[] getPosters() {
        return posters;
    }

    public void setPosters(Poster[] posters) {
        this.posters = posters;
    }

    public int getLimitMovies() {
        return limitMovies;
    }

    public void setLimitMovies(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public PosterRepository() {
        this.limitMovies = 10;
    }

    public PosterRepository(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public Poster[] findAll() { //список фильмов в афише
        Poster[] all = getPosters();
        return all;
    }

    public void save(Poster newFilm) { // метод добавления фильма к афише
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newFilm;
        posters = tmp;
    }

    public Poster[] findById(int id) { // возвращает объект по идентификатору
        Poster[] result = new Poster[1];
        for (Poster poster : posters) {
            if (poster.getId() == id) {
                result = new Poster[]{poster};
            }
        }
        return result;
    }

    public void removeById(int id) { //удаляет объект по идентификатору
        Poster[] tmp = new Poster[posters.length - 1];
        int copyToIndex = 0;
        for (Poster poster : posters) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
    }

    public void removeAll() { //очиска репозитория
        Poster[] tmp = new Poster[0];
        posters = tmp;
    }

    public Poster[] getLast() { //вывод фильмов в порядке добавления с лимитом
        int resultLength = 0;
        if (limitMovies > posters.length) {
            resultLength = posters.length;
        } else {
            resultLength = limitMovies;
        }
        Poster[] tmp = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}