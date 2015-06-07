package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Círculo {


    private final float PI;
    public float radio;
    public float radioSQR;
    public float area;

    public Círculo(float radio) {
        this.radio = radio;
        PI = (float) 3.1416;
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
}
