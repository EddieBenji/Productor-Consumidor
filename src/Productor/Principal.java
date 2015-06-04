package Productor;

import Compartido.Círculo;
import Consumidor.Anidación_1;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Principal {


    public static void main(String[] args) throws InterruptedException {
        Círculo círculo = new Círculo(5);
        Anidación_1 c = new Anidación_1(círculo);
        c.start();
        System.out.println("El número representa el nivel de anidación en donde se encuentran.");
        synchronized(c){
            try{
                System.out.println("1. Esperando a que se calcule el área para imprimirla");
                c.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("1. El área es: " + c.círculo.area);
        }
    }


}
