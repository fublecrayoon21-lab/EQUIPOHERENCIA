package HerenciaEquipo;

import HerenciaEquipo.Dispositivo;


import java.util.ArrayList;

public class GestorDispositivos {
    private ArrayList<Dispositivo> listaDispositivos;

    public GestorDispositivos(){
        listaDispositivos= new ArrayList<Dispositivo>();
    }

    public boolean arrayVacio(){
        return listaDispositivos== null || listaDispositivos.isEmpty();
    }

    public void agregarObjeto(Dispositivo obj){
        listaDispositivos.add(obj);
    }
    public float calcularTotal(){
        float total= 0;

        for (Dispositivo dispositivo: listaDispositivos){
            total += dispositivo.calcularPrecioFinal();}
        return total;}

    public String consultaGral(){
        String resultado= "-".repeat(30)+ "\n";
        for (Dispositivo dispositivo : listaDispositivos){
            resultado += dispositivo.toString()+ "\n";}
        return resultado;}

    public String contarObjetos(){
        byte tel= 0;
        byte tablet= 0;
        byte lap= 0;

        for (Dispositivo dispositivo: listaDispositivos){
            if (dispositivo instanceof Telefono) tel++;
            else if (dispositivo instanceof Tablet)tablet++;
            else if (dispositivo instanceof Laptop)lap++;
        }
        return ("\t\n Telefonos: " + tel+ "\t\n Tablets:"+ tablet+
                "\t\n Laptops: "+ lap);}
}
