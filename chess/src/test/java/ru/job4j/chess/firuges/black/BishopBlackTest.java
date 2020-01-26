package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell res = bishopBlack.position();
        assertSame(res, Cell.C8);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Cell[] res = bishopBlack.way(C1, G5);
        Cell[] expected = {D2, E3, F4, G5};
        System.out.printf("result: %s____expected: %s",Arrays.toString(res), Arrays.toString(expected));
        assertArrayEquals(res, expected);
}

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(F8);
        Figure result = bishopBlack.copy(H3);
        assertSame(result.position(), H3);
    }
}