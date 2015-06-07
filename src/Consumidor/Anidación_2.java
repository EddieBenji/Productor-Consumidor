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

            this.círculo.calculateRadioRadio();
            System.out.println("3. Radio al cuadrado calculado");

        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("\nSe interrumpió el proceso hijo, por lo tanto la aplicación se cerrará");

        }

    }
}
