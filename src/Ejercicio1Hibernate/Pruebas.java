package Ejercicio1Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Pruebas {
	
	public void borraSeguro(Seguro seg) {
		
		//Obtenemos una sesion de la base de datos con el metodo getsession
		
		Session session = Utilidades.getSessionFactory().openSession();
		Transaction tx = null;
		try {

		
			tx = session.beginTransaction();
			
			session.delete(seg);
		
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Ocurrió un error");
		} finally {
			
			session.close();
		}

	}

	
	public void actualizaSeguro(Seguro seg) {
		
		Session session = Utilidades.getSessionFactory().openSession();
		Transaction tx = null;
		try {

		
			tx = session.beginTransaction();
			
			session.update(seg);
			
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Ocurrió un error");
		} finally {
			session.close();
		}

	}
	
	
	public void InsertaSeguro(Seguro seg) {
		
		Session session = Utilidades.getSessionFactory().openSession();
		Transaction tx = null;
		try {

			
			tx = session.beginTransaction();
			
			session.save(seg);
			
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Ocurrió un error");
		} finally {
			session.close();
		}

	}

	
	public Seguro MuestraSeguro(int id) {
		
		Session session = Utilidades.getSessionFactory().openSession();
		Seguro seg = new Seguro();

		
		session.beginTransaction();
		
		seg = (Seguro) session.load(Seguro.class, id);
		System.out.println("Seguro tras ser recuperado:"
				+ seg.toString());
		
		session.getTransaction().commit();
		
		return seg;
	}


	public static void main(String[] args) {
		Seguro seg = new Seguro();
		Seguro segD = new Seguro();
		Seguro segR;
		seg.setNombre("Pankaj");
		seg.setNif("B66668");
		seg.setNumHijos(2);
		seg.setEdad(20);
		seg.setFechaCreacion(new Date());
		segD.setNombre("Para borrar");
		segD.setNumHijos(0);
		segD.setNif("Para borrar");
		segD.setFechaCreacion(new Date());

		Pruebas prueba = new Pruebas();
		prueba.InsertaSeguro(seg);
		
		System.out.println("Empleado almacenado:" + seg.toString());
		segR = prueba.MuestraSeguro(seg.getIdSeguro());
		System.out.println("Empleado recuperado:" + segR.toString());
		seg.setNombre("Pankajooo");
		prueba.actualizaSeguro(seg);
		System.out.println("Empleado almacenado para borrar:" + segD.toString());
		prueba.borraSeguro(segD);
		System.out.println("Empleado borrado:" + segD.toString());
		Utilidades.getSessionFactory().close();
	}

}