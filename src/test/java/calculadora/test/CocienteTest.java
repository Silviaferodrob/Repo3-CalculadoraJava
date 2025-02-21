package calculadora.test;

import calculadora.Cociente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CocienteTest {

    private Cociente cociente;

    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    @Test
    void testDivisionReales() {
        assertEquals(2.0, cociente.divisionReales(6.0, 3.0), "La división de 6.0 entre 3.0 debe ser 2.0");
    }

    @Test
    void testDivisionEnteros() {
        assertEquals(2, cociente.divisionEnteros(6, 3), "La división de 6 entre 3 debe ser 2");
    }

    @Test
    void testInversoReal() {
        assertEquals(0.5, cociente.inversoReal(2.0), "El inverso de 2.0 debe ser 0.5");
    }

    @Test
    void testRaiz() {
        assertEquals(4.0, cociente.raiz(16.0), "La raíz de 16.0 debe ser 4.0");
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> cociente.divisionReales(6.0, 0), "No se puede dividir entre cero");
    }

    @Test
    void testInversoDeCero() {
        assertThrows(ArithmeticException.class, () -> cociente.inversoReal(0), "No se puede calcular el inverso de cero");
    }

    @Test
    void testRaizDeNumeroNegativo() {
        assertThrows(ArithmeticException.class, () -> cociente.raiz(-4.0), "No se puede calcular la raíz de un número negativo");
    }
}
