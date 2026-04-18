package TEST;

import EntradaSalida.JOption1;
import HerenciaEquipo2.*;

public class MenuBioparque {
    public static void main (String[]args){
        menuBioparque();}
    public static void menuBioparque() {


            String menu = "Leon, Jirafa, Aguila, Pinguino, Cocodrilo, Consulta general, Contar, Salir";
            byte op = JOption1.botonOpciones(menu);

            GestorAnimal gestor = new GestorAnimal();

            while (op != 7) {

                switch (op) {

                    case 0:
                        gestor.agregarAnimal(new Leon(
                                JOption1.leerString("Nombre: "),
                                JOption1.leerFloat("Tamaño de melena: "),
                                JOption1.leerByte("Edad: "),
                                JOption1.leerFloat("Peso: "),
                                JOption1.leerString("Sexo: "),
                                JOption1.leerString("Horario de comida: "),
                                JOption1.leerString("Salud: "),
                                JOption1.leerString("Tipo de pelaje: "),
                                JOption1.leerByte("Temperatura: ")
                        ));
                        break;

                    case 1:
                        gestor.agregarAnimal(new Jirafa(
                                JOption1.leerFloat("Altura del cuello: "),
                                JOption1.leerFloat("Longitud de patas: "),
                                JOption1.leerByte("Edad: "),
                                JOption1.leerString("Nombre: "),
                                JOption1.leerFloat("Peso: "),
                                JOption1.leerString("Sexo: "),
                                JOption1.leerString("Horario de comida: "),
                                JOption1.leerString("Salud: ")
                        ));
                        break;

                    case 2:
                        gestor.agregarAnimal(new Aguila(
                                JOption1.leerFloat("Velocidad de vuelo: "),
                                JOption1.leerByte("Edad: "),
                                JOption1.leerString("Nombre: "),
                                JOption1.sino("¿Puede volar?") == 0,
                                JOption1.leerFloat("Tamaño de ala: "),
                                JOption1.leerString("Tipo de pico: "),
                                JOption1.leerFloat("Peso: "),
                                JOption1.leerString("Sexo: "),
                                JOption1.leerString("Horario de comida: "),
                                JOption1.leerString("Salud: ")
                        ));
                        break;

                    case 3:
                        gestor.agregarAnimal(new Pinguino(
                                JOption1.leerString("Tipo de nado: "),
                                JOption1.leerString("Resistencia al frio: "),
                                JOption1.leerByte("Edad: "),
                                JOption1.leerString("Nombre: "),
                                false,
                                JOption1.leerFloat("Tamaño de ala: "),
                                JOption1.leerString("Tipo de pico: "),
                                JOption1.leerFloat("Peso: "),
                                JOption1.leerString("Sexo: "),
                                JOption1.leerString("Horario de comida: "),
                                JOption1.leerString("Salud: ")
                        ));
                        break;

                    case 4:
                        gestor.agregarAnimal(new Cocodrilo(
                                JOption1.leerFloat("Fuerza de mordida: "),
                                JOption1.leerByte("Tiempo bajo agua: "),
                                JOption1.leerByte("Edad: "),
                                JOption1.leerString("Nombre: "),
                                JOption1.leerString("Tipo de escama: "),
                                JOption1.leerByte("Temperatura ideal: "),
                                JOption1.leerFloat("Peso: "),
                                JOption1.leerString("Sexo: "),
                                JOption1.leerString("Horario de comida: "),
                                JOption1.leerString("Salud: ")
                        ));
                        break;

                    case 5:
                        JOption1.verDatos("Bioparque Vida Global",
                                gestor.consultaGeneral());
                        break;

                    case 6:
                        JOption1.verDatos("Conteo de animales",
                                gestor.contarAnimales());
                        break;

                    default:
                        JOption1.mostrarError("Opcion invalida");
                }

                op = JOption1.botonOpciones(menu);
            }
        }
    }

