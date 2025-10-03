package Alumnos;

import java.io.*;

public class LeerConMedia {

	public static void main(String[] args) {
        FileInputStream fent = null;
        ObjectInputStream entrada = null;
        
        FileOutputStream fsus = null;
        ObjectOutputStream salsus = null;

        FileOutputStream fapr = null;
        ObjectOutputStream salapr = null;

		Alumno alum;
		AlumnoMedia alum2;
		try{
			fent = new FileInputStream("Alumnos.dat");
			entrada= new ObjectInputStream(fent);
			fsus =new FileOutputStream("Suspensos.dat");
			salsus = new ObjectOutputStream(fsus);
			fapr= new FileOutputStream("Aprobados.dat");
			salapr= new ObjectOutputStream(fapr);
		
			try {
				while((alum=(Alumno) entrada.readObject()) != null){
					
					if(alum instanceof Alumno) {
						System.out.println(alum.toString());
						System.out.println("Media: ");
						double media= (alum.getN1() +alum.getN2()+alum.getN3());
						System.out.println(media/3);
						alum2 = new AlumnoMedia(alum.getNombre(), alum.getApellido(),media);
						if (media >=5) {
							salapr.writeObject(alum2);
							
						}
						else {
							alum2 = new AlumnoMedia(alum.getNombre(), alum.getApellido(), media);
							salsus.writeObject(alum2);
						}
					}
					
				}
				fent.close();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
		}
		catch (IOException ex){
			System.out.println("Fin  del documento");
		}
	}

}
