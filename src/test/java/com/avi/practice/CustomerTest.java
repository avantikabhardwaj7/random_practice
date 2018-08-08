package com.avi.practice;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTestNg;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Test;

public class CustomerTest extends JerseyTestNg.ContainerPerClassTest{
	
	@Override
	protected TestContainerFactory getTestContainerFactory() {
		return new GrizzlyWebTestContainerFactory();
	}

	@Override
	protected DeploymentContext configureDeployment() {
		ResourceConfig config = new ResourceConfig(CustomerTest.class);
		return ServletDeploymentContext.forServlet(new ServletContainer(config)).build();
	}
	
	@Test
	public void getCustomers() {
		
		Response response = target("/v1/customers").request().get();
		assertEquals(response.getStatus(), 200);
	}
}
