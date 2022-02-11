package ru.netology;

public class PosterRepository {

    private int filmShowLimit;
    private FilmTile[] tiles = new FilmTile[0];

    //Простой конструктор с значением лимита выдачи по-умолчанию
    public PosterRepository() {
        filmShowLimit = 10;
    }

    //Конструктор с выставлением требуемого лимит выдачи
    public PosterRepository(int filmShowLimit) {
        if (filmShowLimit >= 1) {
            this.filmShowLimit = filmShowLimit;
        } else {
            this.filmShowLimit = 10;
        }
    }

    public void setFilmShowLimit(int filmShowLimit) {
        this.filmShowLimit = filmShowLimit;
    }

    public int getFilmShowLimit() {
        return this.filmShowLimit;
    }


    public void save(FilmTile item) {
        int length = tiles.length + 1;
        FilmTile[] tmp = new FilmTile[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = tiles[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        tiles = tmp;
    }

    public FilmTile[] findAll() {
        return tiles;
    }

    public FilmTile findById(int id) {
        for (int i = 0; i <= (tiles.length - 1); i++) {
            if (id == tiles[i].getTileId()) {
                return tiles[i];
            }
        }
        return null;
    }

    public FilmTile[] removeById(int id) {
        int length;
        int p = 0;
        length = tiles.length;
        //Проверяем, есть ли вообще id в контейнере tiles
        for (int i = 0; i <= (tiles.length - 1); i++) {
            if (id == tiles[i].getTileId()) {
                length = tiles.length - 1;
            } else {
                return null;
            }
        }
        FilmTile[] tmp = new FilmTile[length];

        for (int i = 0; i < length - 1; i++) {
            if (id != tiles[i].getTileId()) {
                tmp[p] = tiles[i];
                p++;
            }
        }
        tiles = tmp;
        return tiles;
    }

    public FilmTile[] removeAll() {
        FilmTile[] tmp = new FilmTile[0];
        tiles = tmp;
        return tiles;
    }

}
