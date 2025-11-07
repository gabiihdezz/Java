package Animales;

import java.util.Random;

public class Gallina extends Animal{
	
	int velocidadVolar=15;

	Gallina(String n) {
		super(n);
		this.velocidad=3;
	}
	
	public void correr() {
		Random rand = new Random();
		
		int num= Math.abs(rand.nextInt(3));
		
		if (num==0) {
			System.out.println(this.nombre + "pone un huevo");
		}
	}
	

}