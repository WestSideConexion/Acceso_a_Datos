package Ejercicio1Hibernate;

import java.io.Serializable;
import java.util.*;

public class Seguro implements Serializable{
	
	private int idSeguro;
	private String nif;
	private String nombre;
	private String ape1;
	private String ape2;
	private int edad;
	private int numHijos;
	
	private Date fechaCreacion;
	
	public int getIdSeguro() {
		return idSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe1() {
		return ape1;
	}
	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Override
	public String toString() {
		return "Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2="
				+ ape2 + ", edad=" + edad + ", numHijos=" + numHijos + ", fechaCreacion=" + fechaCreacion.toString() + "]";
	}
	
	
	
	
	
	
	
	


	
	

	
	
	

}