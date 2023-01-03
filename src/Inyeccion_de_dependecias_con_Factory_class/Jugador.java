package Inyeccion_de_dependecias_con_Factory_class;

public class Jugador implements Jugable {
    private String nombre;
    private Consola consola;
    private Jugable dispositivoJugable;


    public Jugador(String nombre, Jugable dispositivoJugable){
        this.nombre = nombre;
        this.dispositivoJugable = dispositivoJugable;
    }


    @Override
    public void jugar() {

    }
}
