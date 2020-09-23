package com.jobs.domain;

public abstract class AbsStaffMember {

	public int id; // Declaramos las variables de la clase abstracta AbsStaffMember
	public String name;
	public String address;
	public String phone;
	public double totalPaid;

	private static int COUNTER_MEMBERS = 1; // Inicializamos el contador para ir asignando ids diferentes a cada miembro

	public AbsStaffMember(String name, String address, String phone) throws Exception { // Método constructor de la clase
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay(); // Declaración del método abstracto pay. No hay que desarrollarlo al ser abstracto.
}
