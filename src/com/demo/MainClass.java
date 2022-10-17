package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		Employee el=new Employee("abhi",50000 );
		Employee e2=new Employee("ashwin",18000 );
		Employee e3=new Employee("ujwal",40000 );
		Employee e4=new Employee("aryan", 19000);
		Employee e5=new Employee("manaz",30000 );
		
		List<Employee> list= new ArrayList<>();
		
		list.add(el);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		list.stream().filter(e->e.getSal()<20000).forEach(e->e.setSal(e.getSal()+5000));
		System.out.println(list);
	}

}
