package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Shared {


    private String name;
    private boolean available;


    public Shared() {
        this.name = "Objeto Compartido";
        this.available = false;
    }

    public synchronized void setName(String name) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        this.name = name;
        available = true;
        notify();
    }

    public synchronized String getName() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notify();

        return name;
    }

}
