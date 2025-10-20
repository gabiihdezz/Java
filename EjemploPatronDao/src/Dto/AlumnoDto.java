package Dto;

import java.util.Date;

public class AlumnoDto {
	private String codAlumno;
	private String nombreAlumno;
	private String apellidosAlumno;
	private char grupo;
	private int edad;

	public String getCodAlumno() {
		return codAlumno;
	}
	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getapellidosAlumno() {
		return apellidosAlumno;
	}
	public void setApellidosSlummno(String apellidosAlumno) {
		this.apellidosAlumno= apellidosAlumno;
	}
	public char getGrupo() {
		return grupo;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "AlumnoDto [codAlumno=" + codAlumno + ", nombreAlumno=" + nombreAlumno + ", apellidosSlummno="
				+ apellidosSlummno + ", grupo=" + grupo + ", edad=" + edad + "]";
	}

	
}
