import java.util.LinkedList;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
        // Crear una instancia de LinkedList que implementa Queue
        Queue<Integer> colaNumerosPares = new LinkedList<>();

        // Agregar los primeros 10 números pares a la cola
        for (int i = 2; i <= 20; i += 2) {
            colaNumerosPares.offer(i);
        }

        // Imprimir elementos de la cola
        System.out.println("Los primeros 10 números pares son:");
        while (!colaNumerosPares.isEmpty()) {
            System.out.println(colaNumerosPares.poll());
        }
    }
}