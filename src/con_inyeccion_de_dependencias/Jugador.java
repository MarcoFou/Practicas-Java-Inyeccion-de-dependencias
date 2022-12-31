package con_inyeccion_de_dependencias;

public class Jugador{
    private String nombre;
    private Consola consola;



    public Jugador(String nombre){
        this.nombre = nombre;
        consola = new Consola("PS4");
    }
    public void jugar(){
        consola.jugar();
    }

}
