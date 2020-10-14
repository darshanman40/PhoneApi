package com.darshanman40.PhoneApi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.darshanman40.PhoneApi.entities.CustomerDO;


public interface CustomerDAO extends JpaRepository<CustomerDO,Long> {

	@Query(value = "SELECT i FROM Customer i ")
	
	List<CustomerDO> findAllCustomer();
	List<CustomerDO> findCustomerByID(Long ID);
	
}
