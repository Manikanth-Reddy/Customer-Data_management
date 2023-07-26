package org.mani.CutomerDataManagement.controller;

import java.util.List;
import java.util.Optional;

import org.mani.CutomerDataManagement.entity.BankEntity;
import org.mani.CutomerDataManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@Autowired
	private BankService  service;
	@GetMapping("/bank/{id}")
	public Optional<BankEntity> finById(@PathVariable("id")Integer id) {
		return service.findById(id);
	}
	@GetMapping("/findAllBank")
	public List<BankEntity> findAll() {
		return service.findAll();
	}
}	
