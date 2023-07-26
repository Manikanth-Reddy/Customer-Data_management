package org.mani.CutomerDataManagement.controller;

import java.util.Optional;

import org.mani.CutomerDataManagement.entity.PersonEntity;
import org.mani.CutomerDataManagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;
	@PostMapping("/person")
	public PersonEntity processPerson(@RequestBody PersonEntity entity) {
		return service.saveOrUpdate(entity);
	}
	@DeleteMapping("/person/{id}")
	public Optional<PersonEntity> deleteById(@PathVariable("id")Integer id) {
		return service.deleteById(id);
	}
	@GetMapping("/person")
	public Optional<PersonEntity> findById(@RequestParam("id") Integer id) {
		return service.findById(id);
	}
}
