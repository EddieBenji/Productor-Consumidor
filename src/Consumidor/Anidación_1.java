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

    public Anidación_1(Círculo círculo){
        this.círculo = círculo;
    }

    @Override
    public void run() {
        //System.out.println("Desde consumidor: "+this.círculo.getName());
        try {
            Anidación_2 a2 = new Anidación_2(círculo);
            a2.start();

            synchronized(a2){
                try{
                    System.out.println("2. Esperando a que se calcule el radio al cuadrado");
                    a2.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println("2. El radio*radio es: " + a2.círculo.radioSQR);
            }

            this.círculo.calculateArea();
            System.out.println("2. Área Calculada");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
