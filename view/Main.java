package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller=new JobsController();

	public static void main(String[] args) throws Exception {
		// Creamos los empleados, jefes, managers y voluntarios.
		// Cada tipo de trabajador utiliza un método diferente de la clase JobsController

		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createManagerEmployee("Laura Manager", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666");
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);

		// Llamada al método que paga a los empleados de la clase JobsController
		controller.payAllEmployees();

		// Creamos una variable String con los nombres de los empleados y otra con los voluntarios
		String allEmployees=controller.getAllEmployees();
		String allVolunteers=controller.getAllVolunteers();

		// Mostramos por consola la lista de nombres de empleados y voluntarios
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		System.out.println("VOLUNTEERS: " + allVolunteers + " \n");

	}

}
