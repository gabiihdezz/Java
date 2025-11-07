package HiloContador;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        HiloContador hilo1 = new HiloContador(contador);
        HiloContador hilo2 = new HiloContador(contador);
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El valor del contador es: " + contador.getValor());
        
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El valor del contador es: " + contador.getValor());
    }
}
