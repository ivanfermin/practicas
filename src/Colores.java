public class Colores {
    private String tipoColor;

    public String getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(String tipoColor) {
        this.tipoColor = tipoColor;
    }

    @Override
    public String toString() {
        return "Colores{" +
                "tipoColor='" + tipoColor + '\'' +
                '}';
    }

    public Colores(String tipoColor) {
        this.tipoColor = tipoColor;
    }
}
