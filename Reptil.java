package HerenciaEquipo2;

public class Reptil extends Animal {
    protected String tipoEscama;
    protected byte temperaturaIdeal;

    public Reptil() {}
    public Reptil(byte edad, String nombre, String tipoEscama, byte temperaturaIdeal, float peso,
                  String sexo, String horcomida, String salud) {
        super(edad, nombre, peso, sexo, horcomida, salud);
        this.tipoEscama = tipoEscama;
        this.temperaturaIdeal = temperaturaIdeal;
    }

}
