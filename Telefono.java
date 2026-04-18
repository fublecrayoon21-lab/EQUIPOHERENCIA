package HerenciaEquipo;

public class Telefono extends Dispositivo {
    private short capacidad;

    public Telefono() {}
    public Telefono(String marca, float precioBase,short capacidad) {
        super(marca, precioBase);
        this.capacidad = capacidad;
    }
    public float calcularPrecioFinal(){
        float precio = super.calcularPrecioFinal(); // incluye 25%

        if (capacidad > 128){
            return precio + (precio * 0.10f);
        }
        return precio;
    }
    @Override
    public String toString(){
        return "\nmarca: "+marca+
                "\nprecioBase: "+ precioBase+
                "\nPrecio Final: "+ calcularPrecioFinal() +
                "\nCapacidad: "+capacidad;
    }

}
