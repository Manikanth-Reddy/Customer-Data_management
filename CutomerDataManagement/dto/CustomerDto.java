package org.mani.CutomerDataManagement.dto;

import org.mani.CutomerDataManagement.entity.CustomerEntity;

import lombok.Data;

@Data
public class CustomerDto {
	private Integer id;
	private String name;
	private String email;
	public CustomerDto() {
		// TODO Auto-generated constructor stub
	}
	public CustomerDto(CustomerEntity customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEamil();
	}
}
