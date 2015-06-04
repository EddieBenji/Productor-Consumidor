package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Círculo {


    private String name;
    private boolean available;
    private final float PI = (float) 3.1416;
    public float radio;
    public float radioSQR;
    public float area;


    public Círculo() {
        this.name = "Transacciones de una Circunferencia";
        this.available = false;
        this.radio = (float) 0.0;
    }

    public Círculo(float radio) {
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

        return radio;
    }

    public synchronized String getName() throws InterruptedException {
        while (!available) {
            Thread.sleep(5000);
            wait();
        }
        available = false;
        notify();

        return name;
    }

    public synchronized void getArea() throws InterruptedException {
        this.area = PI * radioSQR;
        notify();
    }

    public synchronized void calculateRadioRadio() throws InterruptedException {
        System.out.println("Esperando 5 segundos");
        Thread.sleep(5000);
        this.radioSQR = radio * radio;
        notify();
    }

    public synchronized void calculateArea() throws InterruptedException {
        System.out.println("Esperando 5 segundos");
        Thread.sleep(5000);
        this.area = PI * radioSQR;
        notify();

    }


    public float getPI() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;

        return PI;
    }
}
