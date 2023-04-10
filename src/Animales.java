public class Animales {
    private String tipoAnimal;

    public Animales(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                '}';
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }
}
