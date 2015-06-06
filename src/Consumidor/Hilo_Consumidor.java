package Consumidor;

import Compartido.Objeto_Compartido;


public class Hilo_Consumidor extends Thread {

    private Objeto_Compartido objetoCompartido;

    public Hilo_Consumidor(Objeto_Compartido objetoCompartido){
        this.objetoCompartido = objetoCompartido;
    }

    @Override
    public void run() {
        System.out.println("Desde consumidor: "+this.objetoCompartido.getName());
    }
}
