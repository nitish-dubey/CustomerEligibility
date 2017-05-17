package com.credit.eligibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.credit.dao.CustomerDao;
import com.credit.model.Customer;

public class EligibilityIndicator {
	
	public static void main(String args[]){
		List<Customer> customers = CustomerDao.getCustomers();		
		
		/*TODO
		 * return the hashmap of customer with customer id as key and customer itself as value
		 * with following condition;
		 * 1. hashmap should only contain the customers whose credit balance is 50% or less than the 
		 * total credit limit
		 * 2. sort the hashmap customer id attribute in the customer object.
		 * 
		 * */
		HashMap<Integer, Customer> custMap = new HashMap<Integer, Customer>();
		for(Customer cust : customers){
			if(cust.getCreditBalance() <= cust.getCreditLimit()/2)
				custMap.put(cust.getId(), cust);			
		}
		List<Customer> customerListFromMap = new ArrayList<Customer>(custMap.values());
		
		Collections.sort(customerListFromMap, new Comparator<Customer>() {
			public int compare(Customer cust1, Customer cust2){
				return cust1.getId() - cust2.getId() ;
			}
		});
		
		for(Customer cust : customerListFromMap){
			System.out.println(cust.getName());
		}
		
		Iterator<Entry<Integer,Customer>> it = custMap.entrySet().iterator();
		
		while(it.hasNext()){
			Entry<Integer, Customer> entry = it.next();
			System.out.println("Key : "+entry.getKey()+" Value: "+entry.getValue().getName());
		}
	}	
	

}
