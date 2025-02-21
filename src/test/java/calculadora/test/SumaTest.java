package calculadora.test;

import calculadora.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void testSumaReales() {
        assertEquals(6.0, suma.sumaReales(2.5, 3.5), "La suma de 2.5 y 3.5 debe ser 6.0");
    }

    @Test
    void testSumaEnteros() {
        assertEquals(5, suma.sumaEnteros(2, 3), "La suma de 2 y 3 debe ser 5");
    }

    @Test
    void testSumaTresReales() {
        assertEquals(7.0, suma.sumaTresReales(2.0, 2.0, 3.0), "La suma de 2.0, 2.0 y 3.0 debe ser 7.0");
    }

    @Test
    void testSumaAcumulada() {
        suma.sumaAcumulada(10);
        suma.sumaAcumulada(5);
        assertEquals(15, suma.sumaAcumulada(0), "El acumulado debería ser 15");
    }
}

