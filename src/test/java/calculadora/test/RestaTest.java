package calculadora.test;

import calculadora.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    private Resta resta;

    @BeforeEach
    void setUp() {
        resta = new Resta();  // Crear una nueva instancia antes de cada test
    }

    @Test
    void testRestaDosReales() {
        assertEquals(2.5, resta.restaDosReales(5.5, 3.0), 0.0001);
        assertEquals(-1.0, resta.restaDosReales(2.0, 3.0), 0.0001);
    }

    @Test
    void testRestaDosEnteros() {
        assertEquals(5, resta.restaDosEnteros(10, 5));
        assertEquals(-3, resta.restaDosEnteros(2, 5));
    }

    @Test
    void testRestaTresReales() {
        assertEquals(1.0, resta.restaTresReales(5.0, 2.0, 2.0), 0.0001);
        assertEquals(-4.5, resta.restaTresReales(0.0, 2.0, 2.5), 0.0001);
    }

    @Test
    void testRestaAcumulada() {
        assertEquals(-5.0, resta.restaAcumulada(5.0), 0.0001);
        assertEquals(-10.0, resta.restaAcumulada(5.0), 0.0001);
    }
}
