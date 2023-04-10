import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Queue<String> cola1 = new LinkedList<>(); // creamos la primera cola
        Queue<String> cola2 = new LinkedList<>(); // creamos la segunda cola
        Queue<String> cola3 = new LinkedList<>(); // creamos la tercera cola

        // agregamos elementos a la primera cola
        cola1.add("A");
        cola1.add("B");
        cola1.add("C");
        cola1.add("D");
        cola1.add("E");

        // agregamos elementos a la segunda cola
        cola2.add("1");
        cola2.add("2");
        cola2.add("3");
        cola2.add("4");
        cola2.add("5");

        // intercalamos los elementos de las dos colas en la tercera cola
        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                cola3.add(cola1.poll());
            }
            if (!cola2.isEmpty()) {
                cola3.add(cola2.poll());
            }
        }

        // imprimimos los elementos de la tercera cola
        System.out.println("Elementos de la tercera cola:");
        while (!cola3.isEmpty()) {
            System.out.print(cola3.poll() + " ");
        }
    }
}