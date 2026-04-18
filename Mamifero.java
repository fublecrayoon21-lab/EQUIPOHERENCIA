package HerenciaEquipo2;

public class Mamifero extends Animal {
    protected String tipoPelaje;
    protected byte temperatura;

    public Mamifero() {}
    public Mamifero(String nombre, String tipoPelaje,byte edad, byte temperatura, float peso,
                    String sexo, String horcomida, String salud) {
        super(edad, nombre, peso, sexo, horcomida, salud);
        this.tipoPelaje = tipoPelaje;
        this.temperatura = temperatura;
    }
    @Override
    public String toString() {
        return "Tipo de pelaje: "+ tipoPelaje+ "Temperatura: "+ temperatura;
    }


}
