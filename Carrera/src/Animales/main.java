package Animales;

public class main {

	public static void main(String[] args) {
		
		Liebre liebre = new Liebre("liebre");
		Animal gallina = new Animal("gallina");
		Animal tortuga = new Animal("kiki");
		
		Thread hilo1 = new Thread (liebre);
		hilo1.start();
		//Thread hilo2 = new Thread (gallina);
		//Thread hilo3 = new Thread (tortuga);
		//hilo2.start();
		//hilo3.start();

/*		int tiempo=20;
		String nombre;
		int velocidad;
		int distancia;
		
		caballo.correr();
		caballo.correr();
		tortuga.correr();
		tortuga.correr();
		gallina.correr();
		gallina.correr();


		
		caballo.posicion();
		tortuga.posicion();
		gallina.posicion();*/
		
		
	}

}
