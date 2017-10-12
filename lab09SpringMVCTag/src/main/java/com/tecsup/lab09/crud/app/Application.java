package com.tecsup.lab09.crud.app;

import com.tecsup.lab09.crud.bean.Employee;
import com.tecsup.lab09.crud.dao.EmployeeDAO;
import com.tecsup.lab09.crud.dao.EmployeeDAOImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		
		/*
		int id = -1;
		//CREAR UN USUARIO---------------------------------------
		id = dao.create("Tom", "Cruise", (double) 50000);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);

		
		//ACTUALIZAR USUARIO----------------------------------------
		dao.update(id, "Juan2", "Alberto2", (double) 1505);
		
		emp = dao.findById(id);
		
		System.out.println("Update .. " + emp);
		
		//ELIMINAR USUARIO-------------------------------------
		dao.delete(id);

		emp = dao.findById(id);

		System.out.println("Delete .. " + emp);		
		
		*/
		for (Employee item : dao.findAll()) {
			
			System.out.println(item);
			 
		};
		
	}

}

