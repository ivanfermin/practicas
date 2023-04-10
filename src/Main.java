import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una cola
        Queue<Integer> cola = new LinkedList<Integer>();

        // Agregar los números del 1 al 10 a la cola
        for (int i = 1; i <= 10; i++) {
            cola.add(i);
        }

        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}