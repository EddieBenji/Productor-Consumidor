package Consumidor;

import Compartido.Círculo;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Anidación_2 extends Thread {

    public Círculo círculo;

    public Anidación_2(Círculo círculo) {
        this.círculo = círculo;
    }

    @Override
    public void run() {
        try {
            //Esto se hace para el manejo de si un hilo ha sido
            //interrumpido o no:
            if (!this.isInterrupted()) {
                this.círculo.calculateRadioRadio();
                System.out.println("3. Radio al cuadrado calculado");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
