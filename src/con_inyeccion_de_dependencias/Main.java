package con_inyeccion_de_dependencias;

//**
// La inyeccion de dependencias: es un patron que se utiliza en POO que se basa en que un objeto no debe depender de la
// implementacion de ese objeto, sino de su abstraccion.
// Las ventajas son que minimiza las dependencias de cada modulo y facil de testear

public class Main {
    public static void main(String[] args) {

        Jugador jugador = new Jugador("Adri");

        jugador.jugar();

    }
}