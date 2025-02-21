package calculadora;

/**
 * Representamos la operación matemática de la división de varios números.
 *
 * <p>Pasos a seguir</p>
 * <pre>
 *     PASO 1:
 *       - Declaramos las variables necesarias para los cálculos.
 *     PASO 2:
 *       - Realizamos la división de dos números reales (double).
 *     PASO 3:
 *       - Realizamos la división de dos números enteros (int).
 *     PASO 4:
 *       - Calculamos el inverso de un número real (1/a).
 *     PASO 5:
 *       - Calculamos la raíz cuadrada de un número real.
 * </pre>
 *
 * @author silviafernandez
 * @version 0.1
 */
public class Cociente {

    /**
     * División de dos números reales.
     * @param a primer número real.
     * @param b segundo número real.
     * @return el resultado de la división de los dos números reales.
     */
    public double divisionReales(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    /**
     * División de dos números enteros.
     * @param a primer número entero.
     * @param b segundo número entero.
     * @return el resultado de la división de los dos números enteros.
     */
    public int divisionEnteros(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    /**
     * Inverso de un número real.
     * @param a número real.
     * @return el inverso del número real (1/a).
     */
    public double inversoReal(double a) {
        if (a == 0) {
            throw new ArithmeticException("No se puede calcular el inverso de cero");
        }
        return 1 / a;
    }

    /**
     * Raíz cuadrada de un número.
     * @param a número real.
     * @return la raíz cuadrada del número real.
     */
    public double raiz(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz de un número negativo");
        }
        return Math.sqrt(a);
    }
}
