// Importamos la clase Scanner para la entrada de datos por el usuario
package ed;

import java.util.Scanner;

// Declaración de la clase principal llamada 'archivo'
public class calculadora {

    // Método para sumar dos números de tipo double
    public static double sumar(double a, double b) {
        return a + b; // Devuelve la suma de los dos parámetros
    }

    // Método para restar dos números de tipo double
    public static double restar(double a, double b) {
        return a - b; // Devuelve la resta de los dos parámetros
    }

    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Creamos una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mensaje inicial para el usuario
        System.out.println("Calculadora Simple:");

        // Solicitamos al usuario que introduzca el primer número
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble(); // Leemos el primer número

        // Solicitamos al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble(); // Leemos el segundo número

        // Llamamos a los métodos para realizar las operaciones y guardamos los resultados
        double resultadoSuma = sumar(numero1, numero2);
        double resultadoResta = restar(numero1, numero2);

        // Mostramos los resultados al usuario
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Cerramos el objeto Scanner para liberar recursos
        scanner.close();
    }
}//nuevo comentario
