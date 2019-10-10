package com.resource;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
public class EmployeeController {

	@ApiOperation(value = "getemployee", nickname = "getemployee")
	@RequestMapping(method = RequestMethod.GET, value = "/restapi/getemployee")
	public Employee getEmployeDetails(
			@ApiParam(value = "empId", required = true, defaultValue = "222") @RequestParam("id") Integer empId) {

		Employee employee1 = new Employee();
		employee1.setEmpId(7899);
		employee1.setEmpName("Phonex");
		employee1.setCompanyName("ABZ");

		return employee1;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/restapi/addemployee")
	public Employee addEmployee(
			@ApiParam(value = "empId", required = true, defaultValue = "111") @RequestParam("empId") Integer empId,
			@ApiParam(value = "empName", required = true, defaultValue = "Phonex") @RequestParam("empName") String empName,
			@ApiParam(value = "company", required = true, defaultValue = "ABZ") @RequestParam("company") String company) {

		
		Employee employee2 = new Employee();
		employee2.setEmpId(empId);
		employee2.setEmpName(empName);
		employee2.setCompanyName(company);
		return employee2;
	}

}
