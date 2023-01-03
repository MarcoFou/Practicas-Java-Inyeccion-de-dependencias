package Inyeccion_de_dependecias_con_Factory_class;

// Esta clase se va a encargar de crear las instancias y retornarlas, de forma que abstrae al resto de la aplicacion de
// crear la instancia en cada clase, y ademas e la unica que contiene como se instancia cada uno de los objetos de la
// interfaz Jugable

public class JugableFactory {
    public enum TipoDeJugable {Pc, Consola};

    public static Jugable create(TipoDeJugable tipo){

        // declaro el objeto a retornar
        Jugable jugable = null;

        switch (tipo) {
            case Pc -> jugable = new Pc("Windows 10");
            case Consola -> jugable = new Consola("PS4");
            default -> System.out.println("error en seteo");
        }
        return jugable;
    }
}
