package com.shubh.restjersey;
/**
 * @author Shubhadeep Sarkar
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/fahrenheittocelsius")
public class FtoCService {
	@GET
	@Produces("application/xml")
	public String convertFtoC() {
		
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32)*5/9;
 
		String result = celsius.toString();
		return "<ftocservice>" + "<celsius>" + result + "</celsius>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>" + "</ftocservice>";	
	}
 
	@Path("{f}")
	@GET
	@Produces("application/xml")
	public String convertFtoCfromInput(@PathParam("f") Double f) {
		
		Double fahrenheit=f;
		Double value;
		value = (fahrenheit - 32)*5/9;
		
		Double celsius = (double) Math.round(value * 100) / 100;
 
		String result = celsius.toString();
		return "<ftocservice>" + "<celsius>" + result + "</celsius>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>" + "</ftocservice>";
	}
}