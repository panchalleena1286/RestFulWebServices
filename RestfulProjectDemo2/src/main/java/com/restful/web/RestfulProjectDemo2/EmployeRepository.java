package com.restful.web.RestfulProjectDemo2;

import java.util.ArrayList;
import java.util.List;

public class EmployeRepository {

	List<Employe> emps;
	
	public EmployeRepository()
	{
		emps = new ArrayList<>();
		Employe e1 = new Employe();
		e1.setEname("Leena");
		e1.setEno(22);
		
		Employe e2 = new Employe();
		e2.setEname("Rachu");
		e2.setEno(25);
		
		
		emps.add(e1);
		emps.add(e2);
	}
	
	public List<Employe> getEmps()
	{
		return emps;
	}
	
	public Employe getEmploye(int id)
	{
	
		for(Employe e1 : emps)
		{
			if(e1.getEno() == id)
				return e1;
		}
		return null;
	}
	
	public void create(Employe e1){
		emps.add(e1);
	}
}

