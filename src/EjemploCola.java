import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class EjemploCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> cola = new LinkedList<String>();

        // Agregar elementos a la cola
        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");
        cola.add("E");

        // Vaciar la cola
        cola.clear();

        // Agregar nuevos elementos a la cola
        cola.add("F");
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");

        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}