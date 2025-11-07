package CarreraDeMbappes;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
    		/*Hacer una carrera de tres tortugas, hay que crear la clase tortuga,se mueven 1 m por segundo 
    		  y va a ganar la totuga que llege primero a la meta, la cual esta a 20 de distancia. 
    		  cuando las tortugas lleguen a los 5m hay un tunel hasta los 15 
    		  donde no pueden pasar todos a la vez y entran de una en una. 
    		  hay que poner un texto de la tortuga1 a entrado al tunel y de cuando salio al 
    		  tunel. es un ejercicio de hilos.*/
    	
        Semaphore semaforo = new Semaphore(1);

        Tortuga t1 = new Tortuga("Tortuga 1", semaforo);
        Tortuga t2 = new Tortuga("Tortuga 2", semaforo);
        Tortuga t3 = new Tortuga("Tortuga 3", semaforo);

        t1.start();
        t2.start();
        t3.start();
    }
}
