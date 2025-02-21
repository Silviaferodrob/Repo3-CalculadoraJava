package calculadora;

public class Main {
    public static void main(String[] args) {
        // PASO 1.1: creamos paso a paso las instancias de cada clase SUMA
        Suma suma = new Suma();

        // PASO 1.2: Probar la suma de dos números reales
        double resultadoReales = suma.sumaReales(2.5, 3.5);
        System.out.println("Suma de dos reales: " + resultadoReales);

        // PASO 1.3: Probar la suma de dos números enteros
        int resultadoEnteros = suma.sumaEnteros(2, 3);
        System.out.println("Suma de dos enteros: " + resultadoEnteros);

        // PASO 1.4: Probar la suma de tres números reales
        double resultadoTres = suma.sumaTresReales(1.2, 2.3, 3.4);
        System.out.println("Suma de tres reales: " + resultadoTres);

        // PASO 1.5: Probar la suma acumulada
        double acumulado1 = suma.sumaAcumulada(10);
        double acumulado2 = suma.sumaAcumulada(5);
        System.out.println("Suma total acumulada: " + acumulado2);

        // PASO 2.1: creamos la instancia de la clase RESTA
        Resta resta = new Resta();

        // PASO 2.2: Probar la resta de dos números reales
        double resultadoRestaReales = resta.restaDosReales(9.5, 2.5);
        System.out.println("Resta de dos reales: " + resultadoRestaReales);

        // PASO 2.3: Probar la resta de dos números enteros
        int resultadoRestaEnteros = resta.restaDosEnteros(10, 3);
        System.out.println("Resta de dos enteros: " + resultadoRestaEnteros);

        // PASO 2.4: Probar la resta de tres números reales
        double resultadoRestaTres = resta.restaTresReales(20.0, 5.0, 2.0);
        System.out.println("Resta de tres reales: " + resultadoRestaTres);

        // PASO 2.5: Probar la resta acumulada
        double acumuladoResta1 = resta.restaAcumulada(5);
        System.out.println("Valor acumulado después de restar 5: " + acumuladoResta1);

    }
}
