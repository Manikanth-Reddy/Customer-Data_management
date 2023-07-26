package org.mani.CutomerDataManagement.repository;

import java.util.List;
import java.util.Optional;

import org.mani.CutomerDataManagement.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	private PersonRepository repository;

	public PersonEntity save(PersonEntity entity) {
		return repository.save(entity);
	}
	public Optional<PersonEntity> findById(Integer id) {
		return repository.findById(id);
	}
	public List<PersonEntity> findAll() {
		return repository.findAll();
	}
	public Optional<PersonEntity> deleteById(Integer id) {
		Optional<PersonEntity> person = findById(id);
		repository.deleteById(id);
		return person;
	}
	public List<PersonEntity> findByName(String name) {
		return repository.findByName(name);
	}
	public List<PersonEntity> findByEmail(String email) {
		return repository.findByEmail(email);
	}
}
