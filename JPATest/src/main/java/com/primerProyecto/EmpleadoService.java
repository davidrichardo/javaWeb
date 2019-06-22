package com.primerProyecto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpleadoService {
	@PersistenceContext(unitName = "JPATestPU")
	protected EntityManager em;
	
	public Empleado createEmpleado(int id,String name,String lastName,double salary,int edad) {
		Empleado empleado = new Empleado(id);
		empleado.setNombre(name);
		empleado.setApellido(lastName);
		empleado.setEdad(edad);
		empleado.setSalario(salary);
		em.persist(empleado);
		return empleado;
	}
}
