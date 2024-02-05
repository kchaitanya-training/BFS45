package com.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int deptId;
	
	@Column(name="department")
	private String deptName;
	
	@ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
		
	}
	
}
