import java.util.LinkedList;
import java.util.Queue;

public class EjercisioColores {
    public static void main(String[] args) {
        Queue<Colores> cola=new LinkedList<>();
        Colores color1 = new Colores("verde");
        Colores color2 =new Colores("azul");
        Colores color3 =new Colores("amarillo");
        Colores color4 =new Colores("rojo");
        cola.add(color1);
        cola.add(color2);
        cola.add(color3);
        cola.add(color4);
        cola.remove(color4);
        for (Colores datos:cola) {
            System.out.println(datos.getTipoColor());
        }
    }
}
