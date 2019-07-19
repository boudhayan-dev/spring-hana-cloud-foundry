package com.sap.springhanacloudfoundry.repository;

import org.springframework.data.repository.CrudRepository;

import com.sap.springhanacloudfoundry.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	

}
