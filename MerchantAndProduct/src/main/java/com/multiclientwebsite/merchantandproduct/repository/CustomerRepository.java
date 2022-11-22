package com.multiclientwebsite.merchantandproduct.repository;

import com.multiclientwebsite.merchantandproduct.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
