package HerenciaEquipo2;

public class Cocodrilo extends Reptil
{
    private float fuerzaMordida;
    private byte tiempoBajoAgua;

    public Cocodrilo(){}
    public Cocodrilo(float fuerzaMordida, byte tiempoBajoAgua, byte edad, String nombre, String tipoEscama,
                     byte temperaturaIdeal, float peso,
                     String sexo, String horcomida, String salud){
        this.fuerzaMordida = fuerzaMordida;
        this.tiempoBajoAgua = tiempoBajoAgua;
    }
    @Override
    public String hacerSonido() {
        return "Gruñir";
    }
    @Override
    public String toString() {
        return "Cocodrilo{" +
                ", Nombre: "+ nombre +
                ", Edad: " + edad +
                ", Peso: " + peso +
                ", Sexo: " + sexo +
                 "Fuerza de la mordida" + fuerzaMordida +
                "Tiempo bajo agua: " + tiempoBajoAgua +
                ", Tipo de comida: "+ horcomida +
                ", Salud: " + salud +
                '}';
    }

}
