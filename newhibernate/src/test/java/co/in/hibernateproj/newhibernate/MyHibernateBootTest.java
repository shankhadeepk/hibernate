package co.in.hibernateproj.newhibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import co.in.hibernateproj.newhibernate.model.Address;
import co.in.hibernateproj.newhibernate.model.Employee;
import co.in.hibernateproj.newhibernate.service.EmployeeService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyHibernateBootTest{ 
    
	@Autowired
	@Qualifier("employeeService")
	public EmployeeService employeeService;
	
	@Test
	public void checkSave() {
		Employee emp=new Employee();
		emp.setEmpId(10002);
		emp.setDeptId(101);
		emp.setEmpName("Shankhadeep");
		emp.setSalary(2000.00);
		
		Address addr=new Address();
		addr.setAddress1("102 Pathare thube");
		addr.setAddress2("102 Pathare thube");
		addr.setCity("Pune");
		addr.setPin("411001");
		
		emp.setAdress(addr);
		
		employeeService.save(emp);
	}
}
