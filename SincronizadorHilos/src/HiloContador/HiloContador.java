package HiloContador;

public class HiloContador extends Thread{
	private Contador contador;
		HiloContador (Contador c){
		this.contador=c;
	}
	public void run() {
		for(int i = 0 ; i <1000; i++) {
			contador.incrementar();
		}
	}
	
}
