package HerenciaEquipo2;

public class Pinguino extends Ave{
    private String tipoNado;
    private String resFrio;

    public Pinguino() {}
    public Pinguino(String tipoNado, String resFrio, byte edad, String nombre,boolean puedeVolar, float ala,
                    String tipoPico, float peso,
                    String sexo, String horcomida, String salud) {
        this.tipoNado = tipoNado;
        this.resFrio = resFrio;
    }
    @Override
    public String hacerSonido() {
        return "Graznido";
    }
    @Override
    public String toString() {
        return "Pinguino{" + "Velocidad de vuelo: " + tipoNado +
                "\nNombre: "+ nombre +
                "\nEdad: " + edad +
                "\nTipo nado: " + tipoNado +
                "\nResistencia al frio: " + resFrio +
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
