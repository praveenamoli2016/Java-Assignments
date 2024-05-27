package com.wuelevate;

import java.util.stream.Stream;

class Employee {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StreamAPI3 {

	public static void main(String[] args) {
//		List<Employee> employees = new ArrayList();
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Praveen");
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Naveen");
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Rishab");

//		employees.add(employee);
//		employees.add(employee2);
//		employees.add(employee3);

		Stream<Employee> employees = Stream.of(employee, employee2, employee3);
		
//		Boolean empPresent = employees.stream().anyMatch(emp-> emp.getName() == "Rishab");
//		System.out.println(empPresent);
		
//		 Stream<Employee> empl = employees.stream().filter(emp-> emp.getName().length() >6);
		 Stream<Employee> empl = employees.filter(emp-> emp.getName().length() >6);
		 empl.map(e-> e.getName()).forEach(e-> System.out.println(e));
		 
		 
	}
}
