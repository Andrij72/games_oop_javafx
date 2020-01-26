package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void move() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        assertTrue(lg.move(Cell.C1, Cell.G5));
    }
}