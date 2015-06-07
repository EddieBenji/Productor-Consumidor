package Consumidor;

import Compartido.Shared;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Consumer extends Thread {

    private Shared shared;

    public Consumer(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {

        try {

            System.out.println("C. Consumidor quiere imprimir el nombre de la variable compartida ");
            System.out.println("C. Desde consumidor: " + this.shared.getName());

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }

}
