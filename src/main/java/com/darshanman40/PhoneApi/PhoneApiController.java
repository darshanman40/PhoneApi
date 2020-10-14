package com.darshanman40.PhoneApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneApiController {

	@GetMapping("customer")
	public String getCustomer(){
		return "customers/customer_form";
	}
	
	@PostMapping("customer")
	public String addCustomer()
	{
		return "customers/customer_form";
	}
	
	@GetMapping("customers")
	public String getCustomers(){
		return "customers/get_customer_list";
	}
}
