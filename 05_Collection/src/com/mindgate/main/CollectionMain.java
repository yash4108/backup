package com.mindgate.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionMain {
public static void main(String[] args) {
	
	List<String> nameList = new  ArrayList<>();
	
	System.out.println(nameList.size());
	
	nameList.add("yash");
	nameList.add("rohit");
	nameList.add("pradip");
	nameList.add("janhavi");
	System.out.println(nameList);
	System.out.println(nameList.size());
	nameList.remove(2);
	System.out.println("after removes");
	System.err.println(nameList);
	System.out.println(nameList.size());
	
	System.out.println();
	List<Employee> employeeList =new ArrayList<>();
	Employee employee1= new Employee(101,"yash",1000);
	Employee employee2= new Employee(102,"janhavi",2000);
	Employee employee3= new Employee(103,"rohit",3000);
	
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	 for(Employee e:employeeList) {
		 System.out.println(e);
	 }
	 System.out.println();
	 System.out.println(employeeList);
	 
	 System.out.println("=================");
	 
	 Set<String> nameSet=new HashSet<>();
	 nameSet.add("Yash");
	 nameSet.add("vinne");
	 nameSet.add("gagan");
	 nameSet.add("pratik");
	 nameSet.add(null);
	 nameSet.add(null);
	 System.out.println(nameSet);
	 
	 System.out.println("+++++++++++++");
	 
	SortedSet<String> sortedNameSet =new TreeSet<>();
	sortedNameSet.add("Yash");
	sortedNameSet.add("vinne");
	sortedNameSet.add("gagan");
	sortedNameSet.add("pratik");
	
	 System.out.println(sortedNameSet);
	 System.out.println("+==============");
	 HashMap<Integer, String>map=new HashMap<>();
	 map.put(101,"vivek");
	 map.put(102,"rohit");
	 map.put(103,"suraj");
	 map.put(104,"siddhus");
	 System.out.println(map);
	 
	 Integer integer=50;
	 System.out.println(integer.hashCode());
	 
	 String string="yash";
	 System.out.println(string.hashCode());
	 
	 System.out.println("============");
	 
	 SortedMap<Integer, String> map2=new TreeMap<>();
	 map2.put(1,"test 1");
	 map2.put(10,"test 10");
	 map2.put(4,"test 4");
	 map2.put(6,"test 6");
	 System.out.println(map2);
	 
}
}
