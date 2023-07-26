package org.mani.CutomerDataManagement.service;

import java.util.List;
import java.util.Optional;

import org.mani.CutomerDataManagement.entity.PersonEntity;
import org.mani.CutomerDataManagement.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	 private PersonDAO dao;
	public PersonEntity saveOrUpdate(PersonEntity entity) {
		return dao.save(entity);
	}
	public Optional<PersonEntity> findById(Integer id ) {
		return dao.findById(id);
	}
	public List<PersonEntity> findAll() {
		return dao.findAll();
	}
	public Optional<PersonEntity> deleteById(Integer id ) {
		return dao.deleteById(id);
	}
}
