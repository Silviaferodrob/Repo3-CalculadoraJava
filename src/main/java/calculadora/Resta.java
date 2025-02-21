package calculadora;
/**
 * Representamos la operación matemática de la resta de varios números.
 *
 * <p>Pasos a seguir</p>
 * <pre>
 *     PASO 1:
 *       - Tenemos que declara una variable que la vamos a llamar "acumulado".
 *       - Vamos a poner que es tipo double (por que puede tener decimales).
 *       - La inicializamos en 0 por que irá acumulando con las operaciones de resta que vayamos haciendo.
 *     PASO 2:
 *       - Vamos a restar dos números reales (double) por lo que describimos cuales son esos números a y b.
 *       - Le pides que te devuelva la resta de esos dos números.
 *     PASO 3:
 *       - Vamos a restar dos números enteros (int) por lo que describimos cuales son estos números a y b.
 *       - Le pides que te devulvan la resta de los dos números enteros.
 *     PASO 4:
 *       - Vamos a restar tres números reales (double) por lo que describimos cuales son esos números a, b y c.
 *       - Le pides que te devuelva la resta de esos tres números.
 *     PASO 5:
 *       - Necesitamos resta os numeros finales de las 3 operaciones de resta anteriores.
 *       - Describimos que a va a ser el valor a añadir el acumulado de las operaciones.
 *       - Le pedimos que te devuelva el acumulado que es la resta del resultado de las anteriores operaciones.
 * </pre>
 *
 * @author silviafernandez
 * @version 0.1
 */
public class Resta {
    private double acumulado = 0;

    /**
     * Resta dos números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return La diferencia entre num1 y num2.
     */
    public double restaDosReales(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Resta dos números enteros.
     *
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @return La diferencia entre num1 y num2.
     */
    public int restaDosEnteros(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Resta tres números reales.
     *
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return La diferencia: num1 - num2 - num3.
     */
    public double restaTresReales(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Realiza una resta acumulada.
     * <p>
     * El valor acumulado se actualiza restando el valor pasado como parámetro.
     *
     * @param valor Valor a restar del acumulado.
     * @return El nuevo valor acumulado.
     */
    public double restaAcumulada(double valor) {
        acumulado -= valor;
        return acumulado;
    }
}
