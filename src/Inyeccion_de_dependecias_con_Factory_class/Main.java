package Inyeccion_de_dependecias_con_Factory_class;

//**
// La inyeccion de dependencias: es un patron que se utiliza en POO que se basa en que un objeto no debe depender de la
// implementacion de ese objeto, sino de su abstraccion.
// Las ventajas son que minimiza las dependencias de cada modulo y facil de testear

public class Main {
    public static void main(String[] args) {

        // Seteo la dependecia: de mi clase Factory
        Jugable dispositivo = JugableFactory.create(JugableFactory.TipoDeJugable.Pc);
        Jugable dispositivo2 = JugableFactory.create(JugableFactory.TipoDeJugable.Consola);

        //-----------------

        Jugador jugador = new Jugador("MarcoFou",dispositivo);
        Jugador jugador2 = new Jugador("Adri",dispositivo2);

        //----------------


        jugador.jugar();
        jugador2.jugar();




    }
}