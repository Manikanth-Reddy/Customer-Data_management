package org.mani.CutomerDataManagement.repository;

import java.util.List;

import org.mani.CutomerDataManagement.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer> {
	List<BankEntity> findByAccountNumber(Long accountNumber);
}
