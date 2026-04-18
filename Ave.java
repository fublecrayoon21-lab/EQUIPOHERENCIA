package HerenciaEquipo2;

public class Ave extends Animal {
    protected boolean puedeVolar;
    protected float ala;
    protected String tipoPico;

    public Ave(){}
    public Ave(byte edad, String nombre,boolean puedeVolar, float ala, String tipoPico, float peso,
               String sexo, String horcomida, String salud){
        super(edad, nombre, peso, sexo, horcomida, salud);
        this.puedeVolar = puedeVolar;
        this.ala = ala;
        this.tipoPico = tipoPico;
    }

}
