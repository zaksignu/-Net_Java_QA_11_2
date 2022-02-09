package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
/*
    // Тест конструктора
    // Тест установки дефолтного значения максимального количества выводимых фильмов
    @Test
    void shouldTestDefaultFilmShowLimit() {
        PosterManager manager = new PosterManager();
        int actual = manager.getFilmShowLimit();
        int excpected = 10;
        assertEquals(excpected, actual);
    }

    // Тест конструктора
    // Тест установки ненормального значения максимального количества выводимых фильмов
    @Test
    void shouldTestOutOfLimitFilmShowLimit() {
        PosterManager manager = new PosterManager(-4);
        int actual = manager.getFilmShowLimit();
        int excpected = 10;
        assertEquals(excpected, actual);
    }

    // Тест конструктора
    // Тест установки  валидного значения максимального количества выводимых фильмов
    @Test
    void shouldTestCustomFilmShowLimit() {
        PosterManager manager = new PosterManager(7);
        int actual = manager.getFilmShowLimit();
        int excpected = 7;
        assertEquals(excpected, actual);
    }

    // Тест добавления фильма в ленту
    @Test
    void addTile() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1, "MotoMoto", "3", "4");
        manager.addTile(uno);
        FilmTile tres = new FilmTile(3, "TexasChainsawMassacre", "3", "4");
        manager.addTile(tres);
        FilmTile[] actual = manager.showTiles();
        FilmTile[] excpected = {uno, tres};
        assertArrayEquals(excpected, actual);
    }

    // Тест вывода всей ленты
    @Test
    void showTiles() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1, "MotoMoto", "3", "4");
        FilmTile duo = new FilmTile(2, "Pinnokio", "2", "4");
        FilmTile tres = new FilmTile(3, "TexasChainsawMassacre", "3", "4");
        FilmTile cuatro = new FilmTile(4, "Lionking", "3", "4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.addTile(cuatro);
        FilmTile[] actual = manager.showTiles();
        FilmTile[] excpected = {uno, duo, tres, cuatro};
        assertArrayEquals(excpected, actual);
    }

    // Штатный обратный вывод последних фильмов
    @Test
    void showSomeTilesStraightTest() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1, "MotoMoto", "3", "4");
        FilmTile duo = new FilmTile(2, "Pinnokio", "2", "4");
        FilmTile tres = new FilmTile(3, "TexasChainsawMassacre", "3", "4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.setFilmShowLimit(2);
        FilmTile[] actual = manager.showSomeTiles();
        FilmTile[] excpected = {tres, duo};
        assertArrayEquals(excpected, actual);
    }

    // Обратный вывод в случае когда в афише фильмов меньше чем заданно
    @Test
    void showSomeTilesNonValidFilmshow() {
        PosterManager manager = new PosterManager();
        FilmTile uno = new FilmTile(1, "MotoMoto", "3", "4");
        FilmTile duo = new FilmTile(2, "Pinnokio", "2", "4");
        FilmTile tres = new FilmTile(3, "TexasChainsawMassacre", "3", "4");
        manager.addTile(uno);
        manager.addTile(duo);
        manager.addTile(tres);
        manager.setFilmShowLimit(5);
        FilmTile[] actual = manager.showSomeTiles();
        FilmTile[] excpected = {tres, duo, uno};
        assertArrayEquals(excpected, actual);
    }

 */
}