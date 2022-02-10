package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    private  PosterRepository posterMock = Mockito.mock(PosterRepository.class);
    private PosterManager managerMock = new PosterManager(posterMock);
    private FilmTile uno =new FilmTile(1,"MotoMoto","3","4");
    private FilmTile duo = new FilmTile(2,"Pinnokio","2","4");
    private FilmTile tres = new FilmTile(3,"TexasChainsawMassacre","3","4");
    private FilmTile cuatro =new FilmTile(4,"Lionking","3","4");
    @Test
    void showEveryThing() {
        FilmTile cinco = new FilmTile(5,"Lomo","1","4");
        FilmTile[] returned = {uno, duo, tres,cuatro};
        Mockito.doReturn(returned).when(posterMock).findAll();
        FilmTile[] expected = {uno, duo, tres,cuatro};
        FilmTile[] actual = managerMock.showEveryThing();
        assertArrayEquals(expected,actual);
    }

    @Test
    void showSomeThing() {

        FilmTile[] returnedFromFindAll = {uno, duo, tres,cuatro};
        int returnFilmShowLimit = 3;
        Mockito.doReturn(returnedFromFindAll).when(posterMock).findAll();
        Mockito.doReturn(returnFilmShowLimit).when(posterMock).getFilmShowLimit();
        FilmTile[] expected = {cuatro, tres, duo};
        FilmTile[] actual = managerMock.showSomeThing();
        assertArrayEquals(expected,actual);
    }
}