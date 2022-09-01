package com.mindgate.repository;

import java.util.List;
import com.mindgate.pojo.Employee;

public class EmployeeRepositoryMain {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee1 = new Employee(101, "yash", 20000);
		Employee employee2 = new Employee(102, "nitin", 30000);
		Employee employee3 = new Employee(103, "sanjay", 40000);

		employeeRepository.addEmployee(employee1);
		employeeRepository.addEmployee(employee2);
		employeeRepository.addEmployee(employee3);
		List<Employee> elist = employeeRepository.getAllEmp();

		for (Employee employee : elist) {
			System.out.println(employee);
		}

		System.out.println("$$$$$$$$+++++++$$$$$$$");

		Employee e = employeeRepository.geteEmployeeByEmployeeId(101);
		System.out.println(e);
		System.out.println();
		System.out.println("before delete");
		elist = employeeRepository.getAllEmp();
		for (Employee employee5 : elist) {
			System.out.println(employee5);
		}
		System.out.println("after delete");
		boolean a = employeeRepository.deleteEmpById(101);
		 elist = employeeRepository.getAllEmp();
		for (Employee employee5 : elist) {
			System.out.println(employee5);
		}
		System.out.println();
		Employee employee4 = new Employee(102, "sanju", 50000);
		System.out.println("before update");
		elist = employeeRepository.getAllEmp();
		for (Employee emp : elist) {
			System.out.println(emp);
		}
		boolean b = employeeRepository.updateEmpByEmpId(employee4);
		System.out.println("after update");
		elist = employeeRepository.getAllEmp();

		for (Employee emp : elist) {
			System.out.println(emp);
		}
	
	
	
	
		
	}
}
