package com.springboot.cruddemo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_code")
	private int departmentCode;
	
	@Column(name="employe_status")
	private String employeStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location location;

	public Employee() {
		
	}

	public Employee(String departmentName, int departmentCode, String employeStatus) {
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.employeStatus = employeStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getEmployeStatus() {
		return employeStatus;
	}

	public void setEmployeStatus(String employeStatus) {
		this.employeStatus = employeStatus;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", departmentName=" + departmentName + ", departmentCode=" + departmentCode
				+ ", employeStatus=" + employeStatus + ", location=" + location + "]";
	}

	
	
	
}