package org.mani.CutomerDataManagement.repository;

import java.util.List;

import org.mani.CutomerDataManagement.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class CustomerDAO {
	@Autowired
	private CustomerRepository repository;

	public CustomerEntity save(CustomerEntity customerEntity) {
		return repository.save(customerEntity);
	}

	public CustomerEntity get(Integer id) {
		return repository.findById(id).orElse(new CustomerEntity(HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}

	public CustomerEntity delete(Integer id) {
		CustomerEntity entity = get(id);
		if (entity.getId() != 404) {

			repository.deleteById(id);
		}
		return entity;
	}

	public List<CustomerEntity> findall() {
		return repository.findAll();
	}

	public List<CustomerEntity> getCustomerByName(String name) {
		return repository.findByName(name);
	}

	public List<CustomerEntity> validateCustomer(@RequestParam("name") String name,
			@RequestParam("email") String eamil) {
		return repository.validateCustomer(name, eamil);
	}
}
