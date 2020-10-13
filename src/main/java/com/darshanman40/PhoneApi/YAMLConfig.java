package com.darshanman40.PhoneApi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {
 
    private String name;
    
    
    public String getName(){
    	return name;
    }

	public void setName(String name) {
		this.name = name;
	}
 
}