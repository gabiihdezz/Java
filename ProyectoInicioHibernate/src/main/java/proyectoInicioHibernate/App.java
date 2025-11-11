package proyectoInicioHibernate;

import org.hibernate.*;

import proyectoInicioHibernate.entidades.Profesor;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session sesion = sessionFactory.openSession();
		
		Transaction tx = sesion.beginTransaction();
		
		Profesor p1 = new Profesor("08", "Sergio", "Aviles");
		
		sesion.persist(p1);
		
		Profesor p2 = sesion.get(Profesor.class, "08");
		System.out.println(p2);
		
		p2.setCiudad("Molleda");
		
		sesion.merge(p2);
		p2 = sesion.get(Profesor.class,"08");
		System.out.println(p2);
		
		tx.commit();
		sesion.close();
		sessionFactory.close();
	}

}
