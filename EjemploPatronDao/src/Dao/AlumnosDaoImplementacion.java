package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import Entidad.AlumnoEntidad;

public class AlumnosDaoImplementacion implements AlumnoDao{

	
	private static AlumnosDaoImplementacion instancia;

	private DataSource datasource;
	
	public AlumnosDaoImplementacion(DataSource datasource) {
		// TODO Auto-generated constructor stub
	}

	public AlumnosDaoImplementacion getInstancia(DataSource datasource) {
		if(instancia ==null) {
			instancia = new AlumnosDaoImplementacion (datasource);
		}
		return instancia;
	}
	
	@Override
	public void crearAlumno(AlumnoEntidad Alumno) {

		String sql = "insert into alumno (codAlumno, nombreAlumno, apellidosAlumno, fechaNacimiento, grupo) values (?,?,?,?,?)";
		try {
			Connection connection = datasource.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,Alumno.getCodAlumno());
			statement.setString(2,Alumno.getNombreAlumno());
			statement.setString(3,Alumno.getapellidosAlumno());
			statement.setDate(4,new java.sql.Date(Alumno.getFechanacimiento().getTime()));
			statement.setString(5,String.valueOf(Alumno.getGrupo()));
			statement.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public AlumnoEntidad obtenerAlumnoPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoEntidad> obtenerTodosLosAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarAlummno(AlumnoEntidad alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarAlumno(String id) {
		// TODO Auto-generated method stub
		
	}

}
