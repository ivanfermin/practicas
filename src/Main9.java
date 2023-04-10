import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>(); // creamos una nueva cola
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar a la cola");
            System.out.println("2. Retirar de la cola");
            System.out.println("3. Mostrar la cola");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = sc.next();
                    cola.add(elemento);
                    break;
                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        String eliminado = cola.poll();
                        System.out.println("El elemento " + eliminado + " ha sido eliminado de la cola.");
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Elementos en la cola:");
                        for (String e : cola) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
