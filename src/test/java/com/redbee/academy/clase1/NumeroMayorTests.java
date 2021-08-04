package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumeroMayorTests {

    @Test
    @DisplayName("Test devolver número mayor")
    void testDevolverNumeroMayor() {
        Integer resultado = NumeroMayor.resolver(1, 2);

        Assertions.assertEquals(2, resultado);
    }

    @Test
    @DisplayName("Test devolver número mayor")
    void testDevolverNumeroMayor2() {
        Integer resultado = NumeroMayor.resolver(2, 2);

        Assertions.assertEquals(2, resultado);
    }

    @Test
    @DisplayName("Test devolver número mayor")
    void testDevolverNumeroMayor3() {
        Integer resultado = NumeroMayor.resolver(0, 2);

        Assertions.assertEquals(2, resultado);
    }

    @Test
    @DisplayName("Test devolver número mayor")
    void testDevolverNumeroMayor4() {
        Integer resultado = NumeroMayor.resolver(0, -1);

        Assertions.assertEquals(0, resultado);
    }
}
