package TEST;
import EntradaSalida.JOption1;
import HerenciaEquipo.*;

public class TestDispositivo {
    public static void main(String[] args) {
        menuLibreria();
    }

    public static void menuLibreria() {
        String menu = "Agregar Dispositivo,Consulta General,Calcular Total,Contar Objetos,Salir";
        GestorDispositivos gestor = new GestorDispositivos();

        byte op = JOption1.botonOpciones(menu);

        while (op != 4 && op != -1) {
            switch (op) {
                case 0: // AGREGAR
                    String menuTipo = "Telefono,Tablet,Laptop";
                    byte tipo = JOption1.botonOpciones(menuTipo);

                    String marca = JOption1.leerString("Marca:");
                    float preciobase = JOption1.leerFloat("Precio base:");

                    Dispositivo nuevo = null;

                    switch (tipo) {
                        case 0: // General
                            short Capacidad = JOption1.leerShort("Capacidad:");
                            nuevo = new Telefono(marca, preciobase,  Capacidad );
                            break;
                        case 1: // tablet
                            short Pulgadas = JOption1.leerShort("Pulgadas:");
                            nuevo = new Tablet(marca, preciobase,  Pulgadas );
                            break;
                        case 2: // Laptop

                            short RAM = JOption1.leerShort("Tamaño de ram:");
                            nuevo = new Laptop(marca, preciobase,  RAM );
                            break;

                    }

                    if (nuevo != null) {
                        gestor.agregarObjeto(nuevo);
                        JOption1.verDatos("✅ Dispositivo Agregado", gestor.consultaGral());
                    }
                    break;

                case 1: // CONSULTA GENERAL
                    JOption1.verDatos("📋 Consulta General", gestor.consultaGral());
                    break;

                case 2: // CALCULAR TOTAL
                    JOption1.verDatos("💰 Total", "Total de precios al publico: $" + gestor.calcularTotal());
                    break;

                case 3: // CONTAR OBJETOS
                    JOption1.verDatos("📊 Conteo", gestor.contarObjetos());
                    break;
            }
            op = JOption1.botonOpciones(menu);
        }
        JOption1.verDatos("👋 Salida", "Programa finalizado.");
    }
}
