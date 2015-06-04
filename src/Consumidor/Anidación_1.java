package Consumidor;

import Compartido.Círculo;


/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Anidación_1 extends Thread {

    public Círculo círculo;

    public Anidación_1(Círculo círculo){
        this.círculo = círculo;
    }

    @Override
    public void run() {
        //System.out.println("Desde consumidor: "+this.círculo.getName());
        try {
            Anidación_2 a1 = new Anidación_2(círculo);
            a1.start();

            synchronized(a1){
                try{
                    System.out.println("2. Esperando a que se calcule el radio al cuadrado");
                    a1.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println("2. El radio*radio es: " + a1.círculo.radioSQR);
            }

            this.círculo.calculateArea();
            System.out.println("2. Area Calculada");
        }catch (Exception ex){

        }

    }
}
