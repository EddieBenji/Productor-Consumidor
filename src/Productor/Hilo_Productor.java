package Productor;

import Compartido.Objeto_Compartido;

public class Hilo_Productor extends Thread {
    private Objeto_Compartido objetoCompartido;

    public Hilo_Productor(Objeto_Compartido objetoCompartido) {
        this.objetoCompartido = objetoCompartido;
    }

    @Override
    public void run() {
        this.objetoCompartido.setName("Recurso compartido cambiado");
    }
}
