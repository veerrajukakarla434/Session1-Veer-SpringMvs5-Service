package com.veer.spring.mvc.application;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@GetMapping("/employee/{name}")
	public @ResponseBody String greet(@PathVariable String name) throws Exception {

		return "Hello " + name + " Welocome To Spring 5 MVC World";
	}
	
	
	@GetMapping(value= "/employee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getEmployee() throws Exception {

		Employee employee = new Employee();
		employee.setEmpId("100");
		employee.setName("Veer");
		employee.setSsn("123-45-6789");
		
		return employee.toString();
	}
	

}
