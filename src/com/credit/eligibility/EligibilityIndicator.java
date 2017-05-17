package com.credit.eligibility;

import java.util.List;

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
		 * 2. sort the hashmap by key.
		 * 
		 * */
		
		
	}
	
	

}
