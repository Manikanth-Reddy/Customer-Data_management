package org.mani.CutomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.mani.CutomerDataManagement.dto.CustomerDto;
import org.mani.CutomerDataManagement.dto.ResponseDTO;
import org.mani.CutomerDataManagement.entity.CustomerEntity;
import org.mani.CutomerDataManagement.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO dao;

	public ResponseDTO<CustomerEntity> saveCustomer(CustomerDto d) {
		CustomerEntity entity = new CustomerEntity(d);
		CustomerEntity save = dao.save(entity);
		ResponseDTO<CustomerEntity> response = new ResponseDTO<CustomerEntity>();
		response.setData(save);
		response.setStatusCode(HttpStatus.OK.value());
		response.setTime(LocalDateTime.now());
		response.setMessage(HttpStatus.OK.name());
		return response;
	}

	public ResponseDTO<CustomerEntity> get(Integer id) {
		ResponseDTO<CustomerEntity> response = new ResponseDTO<CustomerEntity>();
		response.setTime(LocalDateTime.now());
		response.setData(dao.get(id));
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage(HttpStatus.FOUND.name());
		return response;
				
	}

	public ResponseDTO<CustomerEntity> updateCustomer(CustomerDto d) {
		CustomerEntity entity = new CustomerEntity(d);
		CustomerEntity save = dao.save(entity);
		ResponseDTO<CustomerEntity> response = new ResponseDTO<CustomerEntity>();
		response.setData(save);
		response.setStatusCode(HttpStatus.OK.value());
		response.setTime(LocalDateTime.now());
		response.setMessage(HttpStatus.OK.name());
		return response;
	}

	public ResponseDTO<List<CustomerEntity>> findAll() {
		List<CustomerEntity> list = dao.findall();
		ResponseDTO<List<CustomerEntity>> dto = new ResponseDTO<List<CustomerEntity>>();
		if (list.size() != 0) {
			dto.setData(list);
			dto.setMessage("Customer Data");
			dto.setTime(LocalDateTime.now());
			dto.setStatusCode(HttpStatus.FOUND.value());
		} else {
			dto.setStatusCode(HttpStatus.NOT_FOUND.value());
			dto.setMessage("NO Customers Found");
			dto.setTime(LocalDateTime.now());
			dto.setData(null);
		}
		return dto;
	}

	public ResponseDTO<CustomerEntity> deleteByid(Integer id) {
		ResponseDTO<CustomerEntity> responseDTO = new ResponseDTO<CustomerEntity>();
		responseDTO.setData(dao.delete(id));
		responseDTO.setTime(LocalDateTime.now());
		responseDTO.setStatusCode(HttpStatus.FOUND.value());
		responseDTO.setMessage(HttpStatus.FOUND.name());
		return responseDTO;
	}

	public ResponseDTO<List<CustomerEntity>> getCustomerByName(String name) {
		ResponseDTO<List<CustomerEntity>> responseDTO = new ResponseDTO<List<CustomerEntity>>();
		responseDTO.setData(dao.getCustomerByName(name));
		responseDTO.setTime(LocalDateTime.now());
		responseDTO.setMessage(HttpStatus.FOUND.name());
		responseDTO.setStatusCode(HttpStatus.FOUND.value());
		return responseDTO;
	}

	public ResponseDTO<List<CustomerEntity>> validateCustomer(@RequestParam("name") String name,
			@RequestParam("email") String eamil) {
		ResponseDTO<List<CustomerEntity>> responseDTO = new ResponseDTO<List<CustomerEntity>>();
		responseDTO.setData(dao.validateCustomer(name,eamil));
		responseDTO.setTime(LocalDateTime.now());
		responseDTO.setMessage(HttpStatus.FOUND.name());
		responseDTO.setStatusCode(HttpStatus.FOUND.value());
		return responseDTO;
	}
}
