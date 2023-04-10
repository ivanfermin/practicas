import java.util.LinkedList;
import java.util.Queue;
public class Practica1 {
    public static void main(String[] args) {
        Queue<Integer> cola =new LinkedList<>();
        cola.add(1);
        cola.add(2);


        for (Integer dato:cola
            ) {
           System.out.println(dato);
        }
    }
}
