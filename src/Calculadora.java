import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double num1 = 0, num2 = 0, resultado = 0;

        while (opcion != 5) {
            System.out.println("------Calculadora------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}