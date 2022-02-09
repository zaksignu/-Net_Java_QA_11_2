package ru.netology;

public class PosterManager {
    /*
    findAll - возвращает массив всех хранящихся в массиве объектов
    save - добавляет объект в массив
    findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
    removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    removeAll* - полностью вычищает репозиторий (для удаления всех элементов достаточно в поле items положить пустой массив)
     */
    private PosterRepository poster;

    public PosterManager(PosterRepository poster) {
        this.poster = poster;
    }

    public void addItem(FilmTile film) {
        this.poster.save(film);
    }

    public void removeAllItems() {
        this.poster.removeAll();
    }

    public void removeExcactlyOneFilm(int id) {
        this.poster.removeById(id);
    }

    public FilmTile findOneFilm(int id) {
        return this.poster.findById(id);
    }


        /*
    private int filmShowLimit;
    private FilmTile[] tiles = new FilmTile[0];

    //Простой конструктор с значением лимита выдачи по-умолчанию
    public PosterManager() {
        filmShowLimit = 10;
    }

    //Конструктор с выставлением требуемого лимит выдачи
    public PosterManager(int filmShowLimit) {
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

    public void addTile(FilmTile item) {
        int length = tiles.length + 1;
        FilmTile[] tmp = new FilmTile[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = tiles[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        tiles = tmp;
    }

    public FilmTile[] showTiles() {
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


     */
}
