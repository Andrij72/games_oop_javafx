package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.QueenWhite;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test
    public void moveUpAndLeftRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        boolean res = lg.move(Cell.C1, G5);
        assertTrue(res);
    }

    @Test
    public void moveDownAndRightLeft() {
        BishopBlack bishopBlack = new BishopBlack(G5);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        boolean res = lg.move(G5, C1);
        assertTrue(res);
    }

    @Test
    public void moveUpAndRightLeft() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        boolean res = lg.move(C1, A3);
        assertTrue(res);
    }

    @Test
    public void moveDownAndLeftRight() {
        BishopBlack bishopBlack = new BishopBlack(A3);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        boolean res = lg.move(A3, C1);
        assertTrue(res);
    }

    @Test
    public void CheckWhenOnTrackIsOtherFigureThenTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        QueenWhite queenWhite = new QueenWhite(Cell.E3);
        Logic lg = new Logic();
        lg.add(bishopBlack);
        lg.add(queenWhite);
        Cell[] steps = {D2, E3, F4, G5};
        boolean res = lg.check(steps);
        assertThat(res, is(true));
    }
}