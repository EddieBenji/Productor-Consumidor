package Consumidor;

import Compartido.Shared;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Consumer extends Thread {

    private Shared shared;

    public Consumer(Shared shared){
        this.shared = shared;
    }

    @Override
    public void run() {
        System.out.println("Desde consumidor: "+this.shared.getName());
    }
}
