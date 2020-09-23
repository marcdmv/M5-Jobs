package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController extends PaymentFactory{

	private EmployeeRepository repository = new EmployeeRepository(); //Creamos un objeto llamado repository de tipo EmployeeRepository

	public JobsController(){ //Constructor de la clase

	}
	// Creamos un método para cada tipo de trabajador y otro para los voluntarios
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
		repository.addEmployee(boss);
		repository.addBoss(boss);
	}
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
		repository.addEmployee(employee);
	}
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		repository.addEmployee(manager);
		repository.addManager(manager);
	}
	public void createVolunteer(String name, String address, String phone) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, "Voluntario");
		repository.addMember(volunteer);
		repository.addVolunteer(volunteer);
	}

	// Llamada al método que paga todos los empleados de la clase EmployeeRepository e imprimimos por consola el nombre, el id
	// y lo que se le ha pagado al empleado.
	public void payAllEmployees() throws Exception{
		for(AbsStaffMember asm : repository.getAllEmployees()) {
			if (asm.name.equals(""))
				throw new Exception();
			System.out.println(asm.name.split(" ")[0] + ", que es " + asm.name.split(" ")[1] + " y tiene como id el número "
					+ asm.id + " ha recibido su nómina de ");
			asm.pay();
		}
	}

	// Llamada al método de la clase EmployeeRepository que devuelve el nombre de todos los empleados
	public String getAllEmployees() throws Exception{
		String allEmployees = new String();
		for (AbsStaffMember asm : repository.getAllEmployees()) {
			if (asm.name.equals(""))
				throw new Exception();
			allEmployees = allEmployees + asm.name.split(" ")[0] + " ";
		}
		return allEmployees;
	}

	// Llamada al método de la clase EmployeeRepository que devuelve el nombre de todos los voluntarios
	public String getAllVolunteers() throws Exception{
		String allVolunteers = new String();
		for (AbsStaffMember asm : repository.getAllVolunteers()) {
			if (asm.name.equals(""))
				throw new Exception();
			allVolunteers = allVolunteers + asm.name.split(" ")[0] + " ";
		}
		return allVolunteers;
	}
}
