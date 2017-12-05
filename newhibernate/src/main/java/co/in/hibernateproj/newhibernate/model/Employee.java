package co.in.hibernateproj.newhibernate.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	private long empId;	
	private String empName;
	private long deptId;
	private Address address;
	private double salary;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	@Column(name="empname")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	
	@Embedded
	public Address getAdress() {
		return address;
	}
	public void setAdress(Address address) {
		if(address!=null)
			this.address = address;
		else
			this.address=new Address();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
