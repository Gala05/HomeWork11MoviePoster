package ru.netology;

public class PosterRepository {
    private Poster[] posters = new Poster[0];

    public Poster[] findAll() { //список фильмов в афише
        return posters;
    }

    public Poster[] save(Poster newFilm) { // метод добавления фильма к афише
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newFilm;
        posters = tmp;
        return posters;
    }

    public Poster findById(int id) { // возвращает объект по идентификатору

        for (Poster poster : posters) {
            if (poster.getId() == id) {
                return poster;
            }
        }
        return null;
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

    public Poster[] removeAll() { //очиска репозитория
        Poster[] tmp = new Poster[0];
        return tmp;
    }
}