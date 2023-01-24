package org.perscholas.sbahibernateproject;

import org.perscholas.sbahibernateproject.models.Employee;
import org.perscholas.sbahibernateproject.models.Office;
import org.perscholas.sbahibernateproject.services.EmployeeServices;
import org.perscholas.sbahibernateproject.services.OfficeServies;

public class MyCommandLineRunner {
   public static void addData() {
	

    EmployeeServices es = new EmployeeServices();
    es.createOrUpateStudent(App.employees[0]);
    es.createOrUpateStudent(App.employees[1]);
    
  
    
    OfficeServies os = new OfficeServies();
    os.createOrUpateOffices(App.offices[0]);
    os.createOrUpateOffices(App.offices[1]);
     
   }
    		
}
