package org.mani.CutomerDataManagement.controller;

import java.util.List;

import org.mani.CutomerDataManagement.dto.CustomerDto;
import org.mani.CutomerDataManagement.dto.ResponseDTO;
import org.mani.CutomerDataManagement.entity.CustomerEntity;
import org.mani.CutomerDataManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;

	@PostMapping(value = "/processCustomer")
	public ResponseDTO<CustomerEntity> processCustomer(@RequestBody CustomerDto dto) {
		return service.saveCustomer(dto);
	}

	@GetMapping(value = "/getById/{id}")
	public ResponseDTO<CustomerEntity> getById(@PathVariable("id") Integer id) {
		return service.get(id);
	}

	@PutMapping(value = "/update")
	public ResponseDTO<CustomerEntity> update(@RequestBody  CustomerDto dto) {
		return service.updateCustomer(dto);
	}

	@GetMapping(value = "/findAll")
	public ResponseDTO<List<CustomerEntity>> findAll() {
		return service.findAll();
	}

	@DeleteMapping("/deleteById/{id}")
	public ResponseDTO<CustomerEntity> deleteByid(@PathVariable("id") Integer id) {
		return service.deleteByid(id);
	}

	@GetMapping("/CustomerByName/{name}")
	public ResponseDTO<List<CustomerEntity>> getCustomerByName(@PathVariable("name") String name) {
		return service.getCustomerByName(name);
	}

	@PostMapping("/validateCustomer")
	public ResponseDTO<List<CustomerEntity>> validateCustomer(@RequestParam("name") String name,
			@RequestParam("email") String eamil) {
		return service.validateCustomer(name, eamil);
	}
}
