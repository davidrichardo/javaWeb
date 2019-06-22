package com.primerProyecto;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Empleado
 *
 */
@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable {

	   
	@Id
	private int Id;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private double Salario;
	private static final long serialVersionUID = 1L;

	public Empleado() {
		super();
	} 
	
	
	public Empleado(int id) {
		Id = id;
	}


	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getApellido() {
		return this.Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}   
	public int getEdad() {
		return this.Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}   
	public double getSalario() {
		return this.Salario;
	}

	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
   
}
