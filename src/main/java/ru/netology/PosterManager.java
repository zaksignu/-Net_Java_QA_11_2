package ru.netology;

public class PosterManager {
    private PosterRepository poster;

    public PosterManager(PosterRepository poster) {
        this.poster = poster;
    }

    //save
    public void addItem(FilmTile film) {
        this.poster.save(film);
    }

    //removeAll
    public void removeAllItems() {
        this.poster.removeAll();
    }

    //removeById
    public void removeExcactlyOneFilm(int id) {
        this.poster.removeById(id);
    }

    //findById
    public FilmTile findOneFilm(int id) {
        return this.poster.findById(id);
    }

    //findAll
    public FilmTile[] everyThing() {
        return this.poster.findAll();
    }

}
