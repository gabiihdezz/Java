package Dao;

import java.util.List;

import Entidad.AlumnoEntidad;

public interface AlumnoDao {
	

	public void crearAlumno (AlumnoEntidad Alumno);
	public AlumnoEntidad obtenerAlumnoPorId(String id);
	public List <AlumnoEntidad> obtenerTodosLosAlumnos();
	public void actualizarAlummno(AlumnoEntidad alumno);
	public void eliminarAlumno(String id);
}
