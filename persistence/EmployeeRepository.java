package com.jobs.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	private static List<AbsStaffMember> bosses=new ArrayList<>();
	private static List<AbsStaffMember> employees=new ArrayList<>();
	private static List<AbsStaffMember> managers=new ArrayList<>();
	private static List<AbsStaffMember> volunteers=new ArrayList<>();

	public EmployeeRepository(){
		
	}
	
	public List<AbsStaffMember> getAllMembers(){

		return new ArrayList<>(members);
	}

	public List<AbsStaffMember> getAllEmployees(){

		return new ArrayList<>(employees);
	}

	public List<AbsStaffMember> getAllVolunteers(){

		return new ArrayList<>(volunteers);
	}
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}

	public void addBoss(AbsStaffMember boss) throws Exception{
		if(boss==null) throw new Exception();
		bosses.add(boss);
	}
	public void addManager(AbsStaffMember manager) throws Exception{
		if(manager==null) throw new Exception();
		managers.add(manager);
	}
	public void addEmployee(AbsStaffMember employee) throws Exception{
		if(employee==null) throw new Exception();
		employees.add(employee);
	}

	public void addVolunteer(AbsStaffMember volunteer) throws Exception{
		if(volunteer==null) throw new Exception();
		volunteers.add(volunteer);
	}
}
