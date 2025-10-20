package ejemploConexionBD;


import java.io.*;
import java.sql.*;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;


public class conexionMySQL {

	public static void main (String [] args){
		
		Connection show= null;
		Statement stmt= null;
		ResultSet resultado = null;
		
		MysqlDataSource ds = null;
		Properties prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("resources\\conexion.properties");
			prop.load(file);
			
			ds= new MysqlDataSource();

			ds.setUrl(prop.getProperty("url"));
			ds.setUser(prop.getProperty("user"));
			ds.setPassword(prop.getProperty("password"));
			
			Connection conexion = ds.getConnection();
			
			/*String sql = "insert into persona (idpersona, nombre, apellido, numeroTelefonico)"+ 
			"values(?,?,?,?)";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setInt(1,1);
			pst.setString(2, "Sergio");
			pst.setString(3, "Capdevila");
			pst.setInt(4, 694362389);
			
			pst.executeUpdate();
			
			String del = "delete from persona where idpersona=1";
			PreparedStatement pstdel = conexion.prepareStatement(del);
			pstdel.executeUpdate();
*/
			String sel = "SELECT idpersona, nombre, apellido, numeroTelefonico FROM persona WHERE idpersona = ?";
			PreparedStatement pstshow = conexion.prepareStatement(sel);
			pstshow.setInt(1, 1);

			ResultSet rs = pstshow.executeQuery(); // ✅ executeQuery para SELECT

			while (rs.next()) {
			    int id = rs.getInt("idpersona");
			    String nombre = rs.getString("nombre");
			    String apellido = rs.getString("apellido");
			    int telefono = rs.getInt("numeroTelefonico");

			    System.out.println(id + " | " + nombre + " | " + apellido + " | " + telefono);
			}

			rs.close();
			pstshow.close();
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
