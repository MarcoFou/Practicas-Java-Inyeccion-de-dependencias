package sin_inyeccion_de_dependencia;

public class Pc {
    private String modelo;

    public Pc(String modelo){
        this.modelo = modelo;
    }
    public void jugar(){

        System.out.println("Estas jugando a la PC" + " " + modelo);
    }
}
