import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); // creamos una nueva cola
        Scanner sc = new Scanner(System.in);

        // agregamos elementos a la cola
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("8");
        queue.add("9");
        queue.add("10");

        // iteramos la cola y eliminamos elementos pares
        while (!queue.isEmpty()) {
            String elemento = queue.poll();
            int num = Integer.parseInt(elemento);
            if (num % 2 != 0) { // si el número es impar
                System.out.print(elemento + " ");
            }
        }
    }
}