package calculadora;

/**
 * Representamos la operación matemática de la suma de varios números.
 *
 * <p>Pasos a seguir</p>
 * <pre>
 *     PASO 1:
 *       - Tenemos que declara una variable que la vamos a llamar "acumulado".
 *       - Vamos a poner que es tipo double (por que puede tener decimales).
 *       - La inicializamos en 0 por que irá acumulando con las operaciones de suma que vayamos haciendo.
 *     PASO 2:
 *       - Vamos a sumar dos números reales (double) por lo que describimos cuales son esos números a y b.
 *       - Le pides que te devuelva la suma de esos dos números.
 *     PASO 3:
 *       - Vamos a sumar dos números enteros (int) por lo que describimos cuales son estos números a y b.
 *       - Le pides que te devulvan la suma de los dos números enteros.
 *     PASO 4:
 *       - Vamos a sumar tres números reales (double) por lo que describimos cuales son esos números a, b y c.
 *       - Le pides que te devuelva la suma de esos tres números.
 *     PASO 5:
 *       - Necesitamos sumar os numeros finales de las 3 operaciones de suma anteriores.
 *       - Describimos que a va a ser el valor a añadir el acumulado de las operaciones.
 *       - Le pedimos que te devuelva el acumulado que es la suma del resultado de las anteriores operaciones.
 * </pre>
 *
 * @author silviafernandez
 * @version 0.1
 */

public class Suma {

    private double acumulado = 0;

    /**
     * Suma de dos números Reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @return el resultado de la suma de los números reales.
     */
    public double sumaReales(double a, double b) {
        return a + b;
    }

    /**
     * Suma de dos números enteros.
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return el resultado de la suma de los números enteros.
     */
    public int sumaEnteros(int a, int b) {
        return a + b;
    }

    /**
     * Suma de tres números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @param c tercer número real.
     * @return el resultado de la suma de los tres números reales.
     */
    public double sumaTresReales(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Suma con valor acumulado.
     * Este método suma el valor pasado como parámetro al valor acumulado de las operaciones anteriores.
     * @param a número real a sumar al valor acumulado.
     * @return el valor acumulado después de la suma.
     */
    public double sumaAcumulada(double a) {
        acumulado += a;
        return acumulado;
    }
}

