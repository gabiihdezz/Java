package Animales;

public class Tortuga extends Animal{

	Tortuga(String n) {
		super(n);
		this.velocidad=1;
	}
	
	public void correr() {
		this.distancia += this.velocidad;
		this.decirDatos();
	}
}
