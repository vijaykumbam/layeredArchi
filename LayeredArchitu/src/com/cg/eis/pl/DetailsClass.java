package com.cg.eis.pl;

import com.cg.eis.service.EmployeeService;

public class DetailsClass {

	public static void main(String[] args) 
	{		
		EmployeeService Esobj = new EmployeeService();
		Esobj.getDetailsFromUser();
	}

}
