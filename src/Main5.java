import java.util.*;

public class Main5 {

    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>(); // Crear una cola vacía

        Scanner sc = new Scanner(System.in); // Crear objeto Scanner

        int contador = 1; // Inicializar el contador

        while (cola.size() < 10) { // Agregar los primeros 10 números impares a la cola

            if (contador % 2 != 0) {
                cola.add(contador);
            }

            contador++;
        }

        System.out.println("Elementos de la cola: ");

        while (!cola.isEmpty()) { // Imprimir los elementos de la cola

            System.out.println(cola.peek());
            cola.remove();
        }
    }
}