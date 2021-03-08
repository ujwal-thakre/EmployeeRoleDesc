package com.mycompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.EmployeeRole;

@RestController
public class EmployeeRolelController {

	@GetMapping("/employeeRole/{roleId}")
	public EmployeeRole getEmployeeRole(@PathVariable String roleId) {
		return new EmployeeRole(roleId, "Architect");
	}
}
