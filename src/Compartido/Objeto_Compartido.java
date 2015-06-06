package Compartido;


public class Objeto_Compartido {


    private String name;


    public Objeto_Compartido() {
        this.name = null;
    }

    public synchronized void setName(String name) {
        System.out.println("Recurso compartido nombre cambiado");
        this.name = name;

        try {
            System.out.println("Esperando 5 segundos");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    public synchronized String getName() {
        if(this.name == null){
            try {
                System.out.println("Esperando a que seteen el recurso compartido nombre");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return name;
    }

}
