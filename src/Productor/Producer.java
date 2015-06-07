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
        System.out.println("P. El productor cambiará el nombre ");
        this.shared.setName("El productor ha cambiado el nombre");
    }
}
