package Productor;

import Compartido.Shared;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Producer extends Thread {
    private Shared shared;

    public Producer(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        try {

            System.out.println("P. El productor cambiará el nombre de la variable compartida");
            this.shared.setName("Esta es la tarea de sistemas distribuidos!");

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
