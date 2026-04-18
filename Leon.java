package HerenciaEquipo2;

public class Leon extends Mamifero {
    private float tamMelena;

    public Leon(){}

    public Leon(String nombre, float tamMelena, byte edad, float peso,
                String sexo, String horcomida, String salud, String tipoPelaje, byte temperatura) {
        super(nombre, tipoPelaje, edad, temperatura, peso, sexo, horcomida, salud);
        this.tamMelena = tamMelena;
    }

    @Override
    public String hacerSonido() {
        return "Rugido";
    }
    @Override
    public String toString() {
        return "Leon{" + "Tamaño de la melena=" + tamMelena +
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
