
package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Shared {


    private String name;


    public Shared() {
        this.name = "Objeto Compartido";
    }

    public synchronized void setName(String name) {

        this.name = name;
        try {
            System.out.println("Se ha cambiado el nombre del objeto compartido. \n");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    public synchronized String getName() {
        try {
            System.out.println("Alguien quiso obtener el nombre pero no puede, tendrá que esperar\n");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return name;
    }

}
