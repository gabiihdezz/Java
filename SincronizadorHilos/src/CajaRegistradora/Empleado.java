package CajaRegistradora;

import java.util.Random;

class Empleado implements Runnable {
    private Caja caja;
    private String nombre;
    private Random random = new Random();

    public Empleado(Caja caja, String nombre) {
        this.caja = caja;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            double cantidad = 5 + (100 - 5) * random.nextDouble();
            caja.cobrar(cantidad);
            System.out.println("Empleado" +nombre +" cobró "+ cantidad +" €. Total en caja: "+ caja.getTotal() +" €\n" );
            try {
                Thread.sleep(500 + random.nextInt(1000)); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
