package Inyeccion_de_dependecias_con_Factory_class;

public class Pc implements Jugable {
    private String modelo;


    public Pc(String modelo){

        this.modelo = modelo;
        System.out.println("Estas jugando a la PC" + " " + modelo);

    }
    @Override
    public void jugar(){

    }
}
