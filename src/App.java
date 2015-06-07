import Compartido.Shared;
import Consumidor.Consumer;
import Productor.Producer;

/**
 * Created by lalo on 4/06/15.
 *
 * @author lalo
 */
public class App {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Consumer c = new Consumer(shared);
        Producer p = new Producer(shared);

        c.start();
        p.start();
    }
}
