package Alumnos;

import java.io.*;

public class leerAlumnos {
    public static void main(String[] args) {

        FileInputStream fis = null;
        ObjectInputStream fentrada = null;

        try {
            fis = new FileInputStream("Alumnos.dat");
            fentrada = new ObjectInputStream(fis);

            Alumno Objalumno;
            while ((Objalumno= (Alumno) fentrada.readObject()) != null) {
                if (Objalumno instanceof Alumno) {
                    System.out.println(Objalumno.toString());
                }
            }
        } catch (EOFException e) {
            // End of file reached, do nothing
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fentrada != null) fentrada.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    
    }
