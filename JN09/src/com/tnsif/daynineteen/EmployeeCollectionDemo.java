package com.tnsif.daynineteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class EmployeeCollectionDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Atharv", 45000, "HR"));
		empList.add(new Employee(2, "Manasi", 48000, "Account"));
		empList.add(new Employee(5, "Bhavesh", 65000, "IT"));
		empList.add(new Employee(9, "Sonali", 51000, "IT"));
		empList.add(new Employee(3, "Neha", 35000, "Account"));
		System.out.println(empList);

		Predicate<Employee> it=(emp)->emp.getDept().equals("IT");
		Stream<Employee> empStream=empList.stream();
		empStream=empStream.filter(it);
		empStream.forEach(System.out::println);
		System.out.println("------------------");
		
		empStream=empList.stream();
		Function<Employee, Float> fun=(e)->e.getSalary()*0.05f;
		Stream<Float> incentive=empStream.map(fun);
		incentive.forEach(System.out::println);
		
		empStream=empList.stream();
		List<Float> salaries=empStream.map(e->e.getSalary()).toList();
		Stream<Float> salaryStream=salaries.stream();
		Optional<Float> totSalary=salaryStream.reduce((s1,s2)->s1+s2);
		System.out.println("Average Salary : "+totSalary.get()/salaries.size());
		
	}

}
