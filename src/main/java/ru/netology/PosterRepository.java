package ru.netology;

public class PosterRepository {
    /*
    findAll - возвращает массив всех хранящихся в массиве объектов
    save - добавляет объект в массив
    findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
    removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    removeAll* - полностью вычищает репозиторий (для удаления всех элементов достаточно в поле items положить пустой массив)
     */

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

    public int getFilmShowLimit() {
        return this.filmShowLimit;
    }

    public void setFilmShowLimit(int filmShowLimit) {
        this.filmShowLimit = filmShowLimit;
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
        for (int i = 0; i < (tiles.length - 1); i++) {
            if (id == tiles[i].getTileId()) {
                return tiles[i];
            } else {
                return null;
            }
        }
        return null;
    }

    public FilmTile[] removeById(int id) {
        int length;
        int p = 0;
        length = tiles.length;
        for (int i = 0; i < (tiles.length - 1); i++) {
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
        //     int length = tiles.length + 1;
        return tiles;
        ////
    }

    public FilmTile[] removeAll() {
        FilmTile[] tmp = new FilmTile[0];
        tiles = tmp;
        return tiles;
    }


    public FilmTile[] showSomeTiles() {

        int length = tiles.length - 1;
        int p = 0;
        if ((tiles.length - filmShowLimit) <= 0) {
            filmShowLimit = tiles.length;
        }
        FilmTile[] tmp = new FilmTile[filmShowLimit];
        for (int i = (tiles.length - 1); i >= ((tiles.length - filmShowLimit)); i--) {
            tmp[p] = tiles[i];
            p++;
        }
        tiles = tmp;
        return tiles;
    }

}