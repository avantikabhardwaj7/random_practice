package com.avi.practice.project.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.avi.practice.project.delegate.CustomerDelegate;
import com.avi.practice.project.delegate.CustomerDelegateImpl;
import com.avi.practice.project.model.Customer;

/**
 * @author avantika
 *
 */
@Path("/customers")
public class CustomerService {
	
	@Context
	HttpServletResponse servletResponse;
	@Context
	HttpServletRequest servletRequest;
	
	private CustomerDelegate customerDelegate = new CustomerDelegateImpl();
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Customer> getCustomers() {
		List<Customer> customersList = customerDelegate.getListCustomers();
		return customersList;
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Customer addCustomer(@Valid Customer customer) {
		//TODO::: Call delegate add customer
		
		return new Customer();
	}
	
	@Path("/{customerId}")
	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Customer updateCustomer(@PathParam("customerId") String customerId,@Valid Customer customer) {
		// TODO::: Call delegate update customer
		
		return new Customer();
	}
	
	@Path("/{customerId}")
	@DELETE
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response deleteCustomer(@PathParam("customerId") String customerId) {
    //TODO::: call update Delete Customer
		
		return Response.ok().build();
	}
	
}
