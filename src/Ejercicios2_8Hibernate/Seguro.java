package Ejercicios2_8Hibernate;

import java.io.Serializable;
import java.sql.Time;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.jdbc.Blob;



@Entity 
@Table(name = "Seguro")
public class Seguro implements Serializable{
	
	
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "idSeguro", nullable=false, unique=true, length=11)
	private int idSeguro;
	@Column(name = "nif", nullable=true, unique=false, length=255)
	private String nif;
	@Column(name = "nombre", nullable=true, length=255)
	private String nombre;
	@Column(name = "ape1", nullable=true, length=255)
	private String ape1;
	@Column(name = "ape2", nullable=true, length=255)
	private String ape2;
	@Column(name = "edad", nullable=true, length=11)
	private int edad;
	@Column(name = "numHijos", nullable=true, length=11)
	private int numHijos;
	@Column(name = "fechaCreacion", nullable=true)
	private Date fechaCreacion;
	@Column(name="mayor", nullable=true)
	private boolean mayor;
	@Column(name="fechaNacimiento", nullable=true)
	private Date fechaNacimiento;
	@Column(name="horaContacto", nullable=true)
	private Time horaContacto;
	@Column(name="claves", nullable=true, length=10)
	private char[] claves;
	@Column(name="comentarios", nullable=true, length=30)
	private Blob comentarios;
	
	
	public Blob getComentarios() {                  
		return comentarios;                         
	}                                               
	public void setComentarios(Blob comentarios) {  
    	this.comentarios = comentarios;             
	}                                               
	                                                

	
	public char[] getClaves() {
		return claves;
	}
	public void setClaves(char[] claves) {
		this.claves = claves;
	}
	public Time getHoraContacto() {
		return horaContacto;
	}
	public void setHoraContacto(Time horaContacto) {
		this.horaContacto = horaContacto;
	}
	public boolean isMayor() {
		return mayor;
	}
	public void setMayor(boolean mayor) {
		this.mayor = mayor;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
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
				+ ape2 + ", edad=" + edad + ", numHijos=" + numHijos + ", fechaCreacion=" + fechaCreacion.toString() + ", mayor="
				+ mayor + ", fechaNacimiento=" + fechaNacimiento.toString() + ", horaContacto=" + horaContacto.toString() + ", claves="
				+ Arrays.toString(claves) + ", comentarios=" + comentarios.toString() + "]";
	}
	
	
	
	
	
	
	


	
	

	
	
	

}
