package co.in.hibernateproj.newhibernate.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.in.hibernateproj.newhibernate.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{

}
