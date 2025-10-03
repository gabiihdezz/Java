package Animales;


public class Liebre extends Animal{

	public Liebre(String nombre) {
		super(nombre);
		operaciones(velocidad, nombre);
	}

	int operaciones(int velocidad, String nombre) {		
		 velocidad=0;
			for(int i = 0 ; i <=4; i++) {
				velocidad=i;
				System.out.println(velocidad);
			}
			for(int i = 0 ; i <=8; i++) {
				velocidad=0;
				System.out.println(velocidad);
			}
			return velocidad;
	
	}
	

}
