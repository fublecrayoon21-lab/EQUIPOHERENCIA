package HerenciaEquipo;

public class Dispositivo {
    protected String marca;
    protected float precioBase;

    public Dispositivo() {
    }
    public Dispositivo(String marca, float precioBase) {
        this.marca = marca;
        this.precioBase = precioBase;
    }
    public float calcularPrecioFinal() {
        return (float) (precioBase * 1.25);
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Dispositivo: " +
                "Marca: '" + marca + '\'' +
                ", Precio: " + precioBase +
                "Precio Final: " + calcularPrecioFinal() +
                '}';
    }
}
