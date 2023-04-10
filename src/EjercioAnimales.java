import java.util.LinkedList;
import java.util.Queue;

public class EjercioAnimales {
    public static void main(String[] args) {
        Queue <Animales> cola=new LinkedList<>();
        Animales animal1 =new Animales("Perro");
        Animales animal2 =new Animales("gato");
        Animales animal3 =new Animales("conejo");
        Animales animal4 =new Animales("loro");
        cola.add(animal1);
        cola.add(animal2);
        cola.add(animal3);
        cola.add(animal4);
        cola.remove(animal3);
        for (Animales datos:cola) {
            System.out.println(datos.getTipoAnimal());
        }
    }
}
