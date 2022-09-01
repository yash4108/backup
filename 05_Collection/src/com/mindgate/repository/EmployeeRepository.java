package com.mindgate.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> employees = new ArrayList<>();

	public boolean addEmployee(Employee employee) {
		boolean result = employees.add(employee);

		return result;
	}

	public List<Employee> getAllEmp() {
		return employees;
	}

	public Employee geteEmployeeByEmployeeId(int EmpId) {
		for (Employee emp : employees) {
			if (emp.getEmployeeId() == EmpId) {
				return emp;
			}

		}
		return null;

	}

	public boolean deleteEmpById(int EmpId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == EmpId) {
				boolean res = employees.remove(employee);
				return res;
			}
		}
		return false;
	}

	public boolean updateEmpByEmpId(Employee emp) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == emp.getEmployeeId()) {

				employee.setName(emp.getName());
				employee.setSalary(emp.getSalary());
				return true;

			}

		}
		return false;

	}
}
