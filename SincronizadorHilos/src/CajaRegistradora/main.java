package CajaRegistradora;

public class main {
    public static void main(String[] args) {
        Caja caja = new Caja();

        Thread t1 = new Thread(new Empleado(caja, "Ana"));
        Thread t2 = new Thread(new Empleado(caja, "Luis"));
        Thread t3 = new Thread(new Empleado(caja, "María"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("Total final en caja: "+  caja.getTotal()+ "€");
    }
}
