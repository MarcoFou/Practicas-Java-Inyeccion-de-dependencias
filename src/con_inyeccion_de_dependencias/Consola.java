package con_inyeccion_de_dependencias;

public class Consola implements Jugable {
    private String modelo;

    public Consola(String modelo){

        this.modelo = modelo;

        System.out.println("Estas jugando a la consola" + " " + modelo);

    }
    @Override
    public void jugar(){



    }
}
