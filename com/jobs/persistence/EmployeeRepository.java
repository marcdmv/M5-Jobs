package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();// Creamos una lista para todos los miembros
	private static List<AbsStaffMember> bosses=new ArrayList<>();// Creamos una lista para cada tipo de miembro
	private static List<AbsStaffMember> employees=new ArrayList<>();
	private static List<AbsStaffMember> managers=new ArrayList<>();
	private static List<AbsStaffMember> volunteers=new ArrayList<>();

	public EmployeeRepository(){ // Constructor de la clase
		
	}

	public List<AbsStaffMember> getAllEmployees(){ // Método que devuelve un ArrayList con los nombres de los empleados y sus propiedades

		return new ArrayList<>(employees);
	}

	public List<AbsStaffMember> getAllVolunteers(){ // Método que devuelve un ArrayList con los nombres de los voluntarios y sus propiedades

		return new ArrayList<>(volunteers);
	}

	public void addMember(AbsStaffMember member) throws Exception{ // Método que añade un miembro a la lista members. Este método no se usa aun.
		if(member==null) throw new Exception();
		members.add(member);
	}

	public void addBoss(AbsStaffMember boss) throws Exception{ // Método que añade un jefe a la lista bosses.
		if(boss==null) throw new Exception();
		bosses.add(boss);
	}
	public void addManager(AbsStaffMember manager) throws Exception{ // Método que añade un manager a la lista managers.
		if(manager==null) throw new Exception();
		managers.add(manager);
	}
	public void addEmployee(AbsStaffMember employee) throws Exception{ // Método que añade un empleado a la lista employees.
		if(employee==null) throw new Exception();
		employees.add(employee);
	}

	public void addVolunteer(AbsStaffMember volunteer) throws Exception{ // Método que añade un voluntario a la lista volunteers.
		if(volunteer==null) throw new Exception();
		volunteers.add(volunteer);
	}
}
