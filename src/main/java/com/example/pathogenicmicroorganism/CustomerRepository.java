package com.example.pathogenicmicroorganism;

/**
 * @author fsh
 * @version 1.0
 * @time 21/11/2024 13:46
 * @description:
 **/
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);
}
