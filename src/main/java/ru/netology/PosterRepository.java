package ru.netology;

public class PosterRepository {
//    private Poster[] posters = new Poster[0];
//
//    public Poster[] findAll() { //список фильмов в афише
//        return posters;
//    }
//
//    public Poster[] save(Poster newFilm) { // метод добавления фильма к афише
//        Poster[] tmp = new Poster[posters.length + 1];
//        for (int i = 0; i < posters.length; i++) {
//            tmp[i] = posters[i];
//        }
//        tmp[tmp.length - 1] = newFilm;
//        posters = tmp;
//        return posters;
//    }
//
//    public Poster[] fineById(int id) { // возвращает объект по идентификатору
//
//        int copyToIndex = 0;
//        for (Poster p : posters) {
//            if (p.getId() == id) {
//                Poster[] tmp = new Poster[0];
//                tmp[copyToIndex] = p;
//                tmp = posters;
//            }
//        }
//        return posters;
//    }
//
//    public void removeById(int id) { //удаляет объект по идентификатору
//        Poster[] tmp = new Poster[posters.length - 1];
//        int copyToIndex = 0;
//        for (Poster p : posters) {
//            if (p.getId() != id) {
//                tmp[copyToIndex] = p;
//                copyToIndex++;
//            }
//        }
//        posters = tmp;
//    }
//
//    public Poster[] removeAll(int id) { //очиска репозитория
//        Poster[] tmp = new Poster[0];
//        return tmp;
//    }
}

