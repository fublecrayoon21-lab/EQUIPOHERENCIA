package HerenciaEquipo2;

public class Jirafa extends Mamifero {
    private float alturaCuello;
    private float longPatas;

    public Jirafa(){}

    public Jirafa(float alturaCuello, float longPatas, byte edad, String nombre, float peso,
                  String sexo, String horcomida, String salud) {
        super(nombre, "", edad, (byte)0, peso, sexo, horcomida, salud);
        this.alturaCuello = alturaCuello;
        this.longPatas = longPatas;
    }
    public Jirafa(float alturaCuello, float longPatas, byte edad, String nombre, float peso,
                  String sexo, String horcomida, String salud, String tipoPelaje, byte temperatura) {
        super(nombre, tipoPelaje, edad, temperatura, peso, sexo, horcomida, salud);
        this.alturaCuello = alturaCuello;
        this.longPatas = longPatas;
    }
    @Override
    public String hacerSonido() {
        return "Sonido suave";
    }
    @Override
    public String toString() {
        return "Jirafa{" + "Altura del cuello" + alturaCuello +
                "Longitud de las patas: " + longPatas +
                ", Nombre: "+ nombre +
                ", Edad: " + edad +
                ", Peso: " + peso +
                ", Sexo: " + sexo +
                ", Tipo de comida: "+ horcomida +
                ", Salud: " + salud +
                ", Tipo de Pelaje: " + tipoPelaje +
                ", Temperatura: " + temperatura +
                '}';
    }
}

