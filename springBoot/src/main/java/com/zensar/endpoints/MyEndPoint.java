package com.zensar.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="myEndPoint")
@Component
public class MyEndPoint {
	//http:loclhost:8181/myactuator/myEndPoint -- GET
	@ReadOperation
	public String sayHello() {
		return "<h2>Say Hello</h2>";
		
	}

}
