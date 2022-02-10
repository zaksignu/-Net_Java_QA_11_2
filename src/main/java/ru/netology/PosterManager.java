package ru.netology;

public class PosterManager {
    private PosterRepository poster;

    public PosterManager(PosterRepository poster) {
        this.poster = poster;

    }

    //save
    public void addItem(FilmTile film) {
        poster.save(film);
    }

    //removeAll
    public void removeAllItems() {
        poster.removeAll();
    }

    //removeById
    public void removeExcactlyOneFilm(int id) {
        poster.removeById(id);
    }

    //findById
    public FilmTile findOneFilm(int id) {
        return poster.findById(id);
    }

    //findAll
    public FilmTile[] showEveryThing() {
        return poster.findAll();
    }

    public FilmTile[] showSomeThing() {
        FilmTile[] tiles = poster.findAll();
        int p = 0;
        FilmTile[] tmp = new FilmTile[poster.getFilmShowLimit()];
        for (int i = (tiles.length - 1); i >= ((tiles.length - poster.getFilmShowLimit())); i--) {
            tmp[p] = tiles[i];
            p++;
        }
        tiles = tmp;
        return tiles;
    }
}
