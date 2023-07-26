package org.mani.CutomerDataManagement.repository;

import java.util.List;
import java.util.Optional;

import org.mani.CutomerDataManagement.entity.BankEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDAO {
	@Autowired
	private BankRepository repository;
	
	public BankEntity saveOrUpdate(BankEntity bankEntity) {
		return repository.save(bankEntity);
	}
	public Optional<BankEntity> findById(Integer id) {
		return repository.findById(id);
	}
	public List<BankEntity> findAll() {
		return repository.findAll();
	}
	public List<BankEntity> findByAccountNumber(Long acc) {
		return repository.findByAccountNumber(acc);
	}
}
