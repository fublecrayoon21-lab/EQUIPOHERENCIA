package HerenciaEquipo;

public class Tablet extends Dispositivo{
    private short Pulgadas;

    public Tablet() {}
    public Tablet(String marca, float precioBase,short Pulgadas) {
        super(marca, precioBase);
        this.Pulgadas = Pulgadas;
    }
    public float calcularPrecioFinal(){
        float precio = super.calcularPrecioFinal();

        if (Pulgadas > 10){
            return precio + (precio * 0.09f);
        }
        return precio;
    }
    @Override
    public String toString(){
        return "\nmarca: "+marca+
                "\nprecioBase: "+ precioBase+
                "\nPrecio Final: "+ calcularPrecioFinal() +
                "\nPulgadas: "+Pulgadas;    }
}
