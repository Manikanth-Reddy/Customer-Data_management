package org.mani.CutomerDataManagement.service;

import java.util.List;
import java.util.Optional;

import org.mani.CutomerDataManagement.entity.BankEntity;
import org.mani.CutomerDataManagement.repository.BankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	private BankDAO dao;
	public BankEntity save(BankEntity entity) {
		return dao.saveOrUpdate(entity);
	}
	public Optional<BankEntity> findById(Integer id) {
		return dao.findById(id);
	}
	public List<BankEntity> findAll() {
		return dao.findAll();
	}
}
