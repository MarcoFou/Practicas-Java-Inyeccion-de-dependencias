package con_inyeccion_de_dependencias;

public class Jugador implements Jugable{
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
