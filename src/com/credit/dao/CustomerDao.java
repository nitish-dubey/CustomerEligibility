package com.credit.dao;

import java.util.ArrayList;
import java.util.List;

import com.credit.model.Customer;

public class CustomerDao {
	
	public static List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer("Matthew",2,400,1500);
		Customer customer1 = new Customer("David",2,1200,2000);
		Customer customer2 = new Customer("Ronald",1,100,500);
		Customer customer3 = new Customer("Richard",4,600,1000);
		customers.add(customer);
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		return customers;
		
	}

}
