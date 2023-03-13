package ru.netology;

public class Poster { //данные об одном фильме
    private int id; // уникальный идентификатор
    private String title; // название
    private String genre; // жанр
    private String imageUrl; // ссылка на картинку

    public Poster() {
    }

    public Poster(int id, String title, String genre, String imageUrl) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}