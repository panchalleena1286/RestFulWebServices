package com.assignment.six.RestFulAssignment6;

import java.util.ArrayList;
import java.util.List;


public class EmployeRepository {
	//this class work for database
	
	List<Employe> employes;
	
	
	
	public EmployeRepository(){
		
		employes = new ArrayList<>();
		
		Employe e1 = new Employe();
		e1.setEmpid(3);
		e1.setEmpname("leena");
		e1.setEmail("leena@gmail.com");
		
		Employe e2 = new Employe();
		e2.setEmpid(4);
		e2.setEmpname("rachu");
		e2.setEmail("rachu@gmail.com");
		
		employes.add(e1);
		employes.add(e2);
	}
//it return all the employes
	public List<Employe> getEmployes()
	{
		
		return employes;
		
	}
	
	
//it returns only one employe details fetch one particular object
	public Employe getEmploye(int empid){
		
		for(Employe e : employes)
		{
			if(e.getEmpid() == empid)
				return e;
		}
		return new Employe();
	}

	public void create(Employe e1) {
		// TODO Auto-generated method stub
		employes.add(e1);
	}
	
	public Employe delete(int empid){
		
		return ((EmployeRepository) employes).delete(empid);
	}
	
}

