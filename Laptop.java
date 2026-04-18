package HerenciaEquipo;

public class Laptop extends Dispositivo{
    private short RAM;

    public Laptop() {}
    public Laptop(String marca, float precioBase,short RAM) {
        super(marca, precioBase);
        this.RAM = RAM;
    }
    @Override
    public float calcularPrecioFinal(){
        float precio = super.calcularPrecioFinal();

        if (RAM > 16){
            return precio + (precio * 0.15f);
        }
        return precio;
    }
    @Override
    public String toString(){
        return "\nMarca : "+marca+
                "\nPrecioBase : "+ precioBase+
                "\nPrecio Final : "+ calcularPrecioFinal() +
                "\nTamaño de RAM : "+RAM;    }
}
