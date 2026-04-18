package HerenciaEquipo2;

public class Aguila extends Ave{
    private float velVuelo;

    public Aguila(){}
    public Aguila(float velVuelo, byte edad, String nombre,boolean puedeVolar, float ala, String tipoPico, float peso,
                  String sexo, String horcomida, String salud){
        this.velVuelo = velVuelo;
    }
    @Override
    public String hacerSonido() {
        return "Silbido";
    }
    @Override
    public String toString() {
        return "Aguila{" + "Velocidad de vuelo: " + velVuelo +
                "\nNombre: "+ nombre +
                "\nEdad: " + edad +
                "\nPuede volar: " + puedeVolar +
                "\nAla: " + ala +
                "\nTipo Pico: " + tipoPico +
                "\nPeso: " + peso +
                "\nSexo: " + sexo +
                "\nTipo de comida: "+ horcomida +
                "\nSalud: " + salud +
                '}';
    }
}
