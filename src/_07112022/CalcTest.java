package _07112022;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();

    @org.junit.jupiter.api.Test
    void plus() {
        assertEquals(10, calc.plus(5, 5));
    }

    @org.junit.jupiter.api.Test
    void getSmth() {
    }
}