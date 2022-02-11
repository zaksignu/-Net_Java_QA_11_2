package ru.netology;

public class FilmTile {


    private int tileId;
    private String filmName;
    private String filmGenre;
    private String filmPicture;

    public int getTileId() {
        return tileId;
    }
    public FilmTile(int tileId, String filmName, String filmGenre, String filmPicture) {
        this.tileId = tileId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmPicture = filmPicture;


    }


}

