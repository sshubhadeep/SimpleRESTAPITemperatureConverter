package com.shubh.restjersey;
 
/**
 * @author Shubhadeep Sarkar
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/celsiustofahrenheit")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = fahrenheit.toString();
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<fahrenheit>" + result + "</fahrenheit>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = fahrenheit.toString();
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<fahrenheit>" + result + "</fahrenheit>" + "</ctofservice>";
	}
}