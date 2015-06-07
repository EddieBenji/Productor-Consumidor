package Consumidor;

import Compartido.Círculo;


/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
@SuppressWarnings("ALL")
public class Anidación_1 extends Thread {

    public Círculo círculo;

    public Anidación_1(Círculo círculo) {
        this.círculo = círculo;
    }

    @Override
    public void run() {
        try {
            Anidación_2 a2 = new Anidación_2(círculo);
            a2.start();

            synchronized (a2) {
                try {
                    //Si no queremos interrumpir el proceso 2,
                    // comentamos la siguiente línea:
                    a2.interrupt();
                    System.out.println("2. Esperando a que se calcule el radio al cuadrado");

                    if (!a2.isInterrupted()) {
                        a2.wait();
                    }else{
                        System.out.println("2. El proceso 3 ha sido interrumpido");
                        System.out.println("2. Calcularé el área. ");
                        this.círculo.calculateRadioRadio();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("2. El radio*radio es: " + a2.círculo.radioSQR);
            }
            this.círculo.calculateArea();
            System.out.println("2. Área Calculada");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
