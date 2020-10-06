package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		// Gracias al polimorfismo de la clase abstracta AbsStaffMember, podemos extender Volunteer con esta clase abstracta
		// y llamar su método constructor con otras variables, como por ejemplo "description"
		super(name, address, phone);
	}

	@Override
	public void pay() { // Como los voluntarios no cobra, lo dejamos a cero
		totalPaid=0;
	}
}
