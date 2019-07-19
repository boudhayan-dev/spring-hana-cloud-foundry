package com.sap.springhanacloudfoundry.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.springhanacloudfoundry.models.Employee;
import com.sap.springhanacloudfoundry.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public long getCount() {
		long count = employeeRepository.count();
		return count;
	}
	
	public List<Employee> findAllEmployee(){
		List<Employee> employee = new ArrayList<>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}
	
	public boolean insertEmployee(Employee employee) {
	 try {
		employeeRepository.save(employee);
		return true;
	 	} 
	 catch (Exception e) {
		return false;
		}
	}
	
	public Employee findEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		return employee;
	}
	
	public boolean deleteEmployee(long id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		if(employee!=null) {
			employeeRepository.delete(employee);
			return true;
		}
		return false;
	}
}
