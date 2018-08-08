package com.avi.practice.project.dao;

import java.util.ArrayList;
import java.util.List;

import com.avi.practice.project.model.Customer;

/**
 * 
 * Data Access Object layer to directly interact with the DB entities.
 * All DB operations are performed in this layer.
 * 
 * @author avantika
 *
 */
public class CustomerDAOImpl implements CustomerDAOInterface{

	public List<Customer> getConsumers() {
		// TO DO:::::   Fetch data from DB and return
		return new ArrayList<Customer>();
	}
}
