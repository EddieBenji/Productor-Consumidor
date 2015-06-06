import Compartido.Objeto_Compartido;
import Consumidor.Hilo_Consumidor;
import Productor.Hilo_Productor;

public class main {

    public static void main(String[] args) {
        Objeto_Compartido objetoCompartido = new Objeto_Compartido();
        Hilo_Consumidor c = new Hilo_Consumidor(objetoCompartido);
        Hilo_Productor p = new Hilo_Productor(objetoCompartido);



        c.start();
        p.start();


    }


}
