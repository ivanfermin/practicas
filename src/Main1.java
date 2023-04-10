import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Crear una cola
        Queue<String> cola = new LinkedList<String>();

        // Agregar los elementos a la cola
        cola.add("manzana");
        cola.add("pera");
        cola.add("naranja");
        cola.add("plátano");

        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}