package co.in.hibernateproj.newhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.in.hibernateproj.newhibernate.model.Employee;
import co.in.hibernateproj.newhibernate.repo.EmployeeRepository;

@Service
@Qualifier("employeeService")
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void save(Employee emp) {
		System.out.println("saved in db");
		employeeRepository.save(emp);
	}
}
