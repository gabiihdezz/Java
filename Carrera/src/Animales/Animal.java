package Animales;

public class Animal implements Runnable {
    //tres atrubutos: velocidad distancia int, string distancia
	// correr va sumar la distancia a la vcelocidad
	// decirposicion syso que muestre el animal; el animal lleva recorridos x y va en la posicion y
	
	//Tortuga = +1
	//Liebre --> +4 +0(8 veces)
	//Gallina --> Random +3,  +15, +0
	
	public String nombre;
	public int velocidad;
	public int distancia;
	
	public void run (){
		while(true) {
			this.correr();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public Animal(String nombre, int velocidad, int distancia) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.distancia = distancia;
	}

	public Animal(String nombre) {
		this.velocidad=velocidad;
		this.nombre=nombre;
		this.distancia=0;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad, int correr) {
		this.velocidad = velocidad+ correr;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void correr () {
		if(this.nombre=="liebre") {
			Liebre liebre = new Liebre(nombre);
		}
		if(this.nombre=="tortuga") {
			Tortuga tortuga = new Tortuga( nombre);
		}
		this.distancia += this.velocidad;
		return;
	}
	
	public int posicion () {
		return distancia; 
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", velocidad=" + velocidad + ", distancia=" + distancia + "]";
	}


	public void decirDatos() {
		System.out.println(this.nombre + "está a una distancia de: " + this.distancia + "metros.");
		
	}
	
}
