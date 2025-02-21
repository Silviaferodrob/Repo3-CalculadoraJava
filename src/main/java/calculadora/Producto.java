package calculadora;

/**
 * Representamos la operación matemática de la multiplicación de varios números.
 *
 * <p>Pasos a seguir</p>
 * <pre>
 *     PASO 1:
 *       - Declaramos la variable "acumulado", que irá acumulando el producto de las operaciones.
 *       - Inicializamos "acumulado" en 1, porque es el valor neutro para la multiplicación.
 *     PASO 2:
 *       - Multiplicamos dos números reales (double) y devolvemos el resultado.
 *     PASO 3:
 *       - Multiplicamos dos números enteros (int) y devolvemos el resultado.
 *     PASO 4:
 *       - Multiplicamos tres números reales (double) y devolvemos el resultado.
 *     PASO 5:
 *       - Calculamos la potencia de un número (base y exponente) y devolvemos el resultado.
 *     PASO 6:
 *       - El método de producto acumulado multiplica el valor pasado por el acumulado de las operaciones anteriores.
 * </pre>
 *
 * @author silviafernandez
 * @version 0.1
 */
public class Producto {

    private double acumulado = 1;

    /**
     * Producto de dos números Reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @return el resultado del producto de los números reales.
     */
    public double productoReales(double a, double b) {
        return a * b;
    }

    /**
     * Producto de dos números enteros.
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return el resultado del producto de los números enteros.
     */
    public int productoEnteros(int a, int b) {
        return a * b;
    }

    /**
     * Producto de tres números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @param c tercer número real.
     * @return el resultado del producto de los tres números reales.
     */
    public double productoTresReales(double a, double b, double c) {
        return a * b * c;
    }

    /**
     * Potencia de un número.
     * @param base la base del exponente.
     * @param exponente el exponente.
     * @return el resultado de la base elevada a la potencia del exponente.
     */
    public double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Producto acumulado.
     * Este método multiplica el valor pasado como parámetro al valor acumulado de las operaciones anteriores.
     * @param a número real a multiplicar con el valor acumulado.
     * @return el valor acumulado después de la multiplicación.
     */
    public double productoAcumulado(double a) {
        acumulado *= a;
        return acumulado;
    }
}

