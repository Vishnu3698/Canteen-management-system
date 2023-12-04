package com.capgemini.canteenmanagementapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.canteenmanagementapplication.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	//select * from customer where username=? and email= ?
	Optional<Customer> findByUsernameAndEmail(String username, String email);
	//select * from customer where username=? and balance= ?
	Optional<Customer> findByUsernameAndBalance(String username,double balance);

	//save
	//findById
	//findAll
	//delete
}
