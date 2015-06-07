package Productor;

import Compartido.Círculo;
import Consumidor.Anidación_1;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
@SuppressWarnings("ALL")
public class Principal {


    public static void main(String[] args) throws InterruptedException {
        Círculo círculo = new Círculo(5);
        Anidación_1 a1 = new Anidación_1(círculo);
        a1.start();
        System.out.println("El número representa el nivel de anidación en donde se encuentran.");

        synchronized(a1){
            try{
                System.out.println("1. Esperando a que se calcule el área para imprimirla");
                a1.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("1. El área es: " + a1.círculo.area);
        }
    }


}
