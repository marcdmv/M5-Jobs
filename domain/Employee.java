package com.jobs.domain;

public class Employee extends AbsStaffMember { // Extendemos la clase Employee con la AbsStaffMember para así usar
	// la variable totalPaid y el método abstracto pay()

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		// Construimos el objecto Employee con los inputs de la clase main
		super(name, address, phone); // Enlazamos dinámicamente las tres variables a la clase abstracta
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth; // Igualamos los inputs a la variable de clase
		this.paymentRate=paymentRate;
	}
	
	@Override
	public void pay() { // Calculamos el pago en función del paymentRate, que se define en la clase PaymentFactory
		totalPaid=paymentRate.pay(salaryPerMonth);
		System.out.println(totalPaid + " \n"); // Imprimimos el resultado totalPaid
	}
}
