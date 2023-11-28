package ec.epn.edu;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + dividir(num1, num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
        scanner.close();
    }

    static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    static double restar(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}