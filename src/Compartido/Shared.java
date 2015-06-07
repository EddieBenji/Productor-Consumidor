
package Compartido;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class Shared {


    private String name;


    public Shared() {
        this.name = "";
    }

    public synchronized void setName(String name) throws InterruptedException {

        this.name = name;
        System.out.println("Info: Se ha cambiado el nombre del objeto compartido. ");
        Thread.sleep(5000);

        notify();
    }

    public synchronized String getName() throws InterruptedException {

        if (this.name.isEmpty()) {
            System.out.println("Info: Alguien quiso obtener el nombre del objeto compartido " +
                    "pero no puede, debido a que está vacío por lo que tendrá que esperar");
            wait();
        }

        return name;
    }

}
