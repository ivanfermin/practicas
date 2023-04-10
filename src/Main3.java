import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Crear una instancia de LinkedList que implementa Queue
        Queue<String> colaPersonas = new LinkedList<>();

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los nombres completos de las personas a agregar a la cola
        System.out.print("Ingrese los nombres completos de las personas separados por comas: ");
        String entrada = scanner.nextLine();

        // Separar los nombres completos ingresados por comas y agregarlos a la cola
        String[] nombres = entrada.split(",");
        for (String nombre : nombres) {
            colaPersonas.offer(nombre.trim());
        }

        // Imprimir elementos de la cola
        System.out.println("Los elementos de la cola son:");
        while (!colaPersonas.isEmpty()) {
            System.out.println(colaPersonas.poll());
        }
    }
}