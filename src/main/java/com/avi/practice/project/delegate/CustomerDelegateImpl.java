package com.avi.practice.project.delegate;

import java.util.ArrayList;
import java.util.List;

import com.avi.practice.project.model.Customer;

/**
 * This is used a business logic layer to help the service class which calls the methods from it.
 * 
 * @author avantika
 *
 */
public class CustomerDelegateImpl implements CustomerDelegate{

	/* 
	 * Method is used to return list of customers based on the logic
	 */
	public List<Customer> getListCustomers() {
		// TODO:::: Business Logic is implemented in this layer
		//TODO:: Calls list of consumers from the DAO layer. At this point sending hard coded data values.
		List<Customer> customersList = new ArrayList<Customer>();
		customersList.add(new Customer(1, "avantika", "bhardwaj", "avantika.bhardwaj7@gmail.com"));
		
		return customersList;
	}

}
