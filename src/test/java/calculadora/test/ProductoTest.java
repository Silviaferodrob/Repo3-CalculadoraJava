package calculadora.test;

import calculadora.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    void testProductoReales() {
        assertEquals(8.75, producto.productoReales(2.5, 3.5), "El producto de 2.5 y 3.5 debe ser 8.75");
    }

    @Test
    void testProductoEnteros() {
        assertEquals(6, producto.productoEnteros(2, 3), "El producto de 2 y 3 debe ser 6");
    }

    @Test
    void testProductoTresReales() {
        assertEquals(17.28, producto.productoTresReales(2.0, 2.4, 3.6), "El producto de 2.0, 2.4 y 3.6 debe ser 17.28");
    }

    @Test
    void testPotencia() {
        assertEquals(27.0, producto.potencia(3, 3), "3 elevado a la potencia de 3 debe ser 27");
    }

    @Test
    void testProductoAcumulado() {
        producto.productoAcumulado(2);
        producto.productoAcumulado(3);
        assertEquals(6, producto.productoAcumulado(0), "El acumulado debe ser 6 (2 * 3)");
    }
}