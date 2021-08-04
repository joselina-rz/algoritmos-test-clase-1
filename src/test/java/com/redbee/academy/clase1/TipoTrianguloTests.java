package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TipoTrianguloTests {

    @Test
    @DisplayName("Test triángulo equilatero")
    void testTrianguloEquilatero() {
        String resultado = TipoTriangulo.resolver(1, 1, 1);

        Assertions.assertEquals("Equilátero", resultado);
    }

    @Test
    @DisplayName("Test triángulo escaleno")
    void testTrianguloEscaleno() {
        String resultado = TipoTriangulo.resolver(1, 2, 3);

        Assertions.assertEquals("Escaleno", resultado);
    }

    @Test
    @DisplayName("Test triángulo isósceles")
    void testTrianguloIsosceles() {
        String resultado = TipoTriangulo.resolver(1, 1, 2);

        Assertions.assertEquals("Isósceles", resultado);
    }
}
