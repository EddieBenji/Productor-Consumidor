package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Shared {


    private String name;
    private boolean available;
    private final float PI = (float) 3.1416;
    private float radio;


    public Shared() {
        this.name = "Transacciones de una Circunferencia";
        this.available = false;
        this.radio = (float) 0.0;
    }

    public Shared(float radio) {
        this.name = "Transacciones de una Circunferencia";
        this.available = false;
        this.radio = radio;
    }

    public synchronized void setName(String name) throws InterruptedException {
        while (available) {
            wait();
        }
        this.name = name;
        available = true;

        notify();
    }

    public synchronized void setRadio(float radio) throws InterruptedException {
        while (available) {
            wait();
        }
        this.radio = radio;
        available = true;
        notify();
    }

    public synchronized float getRadio() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        notify();
        return radio;
    }

    public synchronized String getName() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        notify();

        return name;
    }

}
