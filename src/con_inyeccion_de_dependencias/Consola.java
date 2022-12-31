package con_inyeccion_de_dependencias;

public class Consola {
    private String modelo;

    public Consola(String modelo){
        this.modelo = modelo;
    }
    public void jugar(){

        System.out.println("Estas jugando a la consola" + " " + modelo);
    }
}
