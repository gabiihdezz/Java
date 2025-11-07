package CarreraDeMbappes;

import java.util.concurrent.Semaphore;

public class Tortuga extends Thread {
	
    private static final int META = 20; 
    private int posicion = 0;
    private String nombre;
    private Semaphore semaforo;

    public Tortuga(String nombre, Semaphore semaforo) {
        this.nombre = nombre;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            while (posicion < META) {
                if (posicion == 5) {
                    System.out.println(nombre + " ha llegado al túnel y espera su turno...");
                    semaforo.acquire(); 
                    System.out.println(nombre + " ha ENTRADO en el túnel.");
                }

                Thread.sleep(1000);
                posicion++;

                if (posicion > 5 && posicion < 15) {
                    System.out.println(nombre + " avanza dentro del túnel (" + posicion + "m)");
                } else if (posicion < 5 || posicion > 15)  {
                    System.out.println(nombre + " corre fuera del túnel (" + posicion + "m)");
                }

                if (posicion == 15) {
                    System.out.println(nombre + " ha SALIDO del túnel.");
                    semaforo.release(); 
                }
                if (posicion == 20) {
                	System.out.println(nombre + " ha llegado a la meta!");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
