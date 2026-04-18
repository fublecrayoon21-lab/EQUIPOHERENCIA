package HerenciaEquipo2;

public class Animal {
    protected byte edad;
    protected String nombre;
    protected float peso;
    protected String sexo;
    protected String horcomida;
    protected String salud;


    public Animal() {}
    public Animal(byte edad, String nombre, float peso,
                  String sexo, String horcomida, String salud) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.horcomida = horcomida;
        this.salud = salud;
    }
    public String hacerSonido() {
        return "Sonido desconocido";
    }
public void setNombre(String nombre) {
        this.nombre = nombre;
}
@Override
public String toString() {
        return "Edad: "+ edad +
                "Nombre: "+ nombre +
                "Peso: "+ peso +
                "Sexo: "+ sexo +
                "Horario de comida: "+ horcomida +
                "Salud: "+ salud+
                "El sonido del animal es: "+hacerSonido();
    }




}