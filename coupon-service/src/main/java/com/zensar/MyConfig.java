package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.netflix.discovery.converters.Auto;
@Component
@RefreshScope
public class MyConfig {
	@Value("${test.testProperty}")
	private String testProperty;
	

	public String getTestProperty() {
		return testProperty;
	}

	public void setTestProperty(String testProperty) {
		this.testProperty = testProperty;
	}
	
	
}
