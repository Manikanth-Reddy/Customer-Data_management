package org.mani.CutomerDataManagement.repository;

import java.util.List;

import org.mani.CutomerDataManagement.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

	List<CustomerEntity> findByName(String name);

	@Query("SELECT c FROM CustomerEntity c WHERE c.name=:name AND c.eamil=:email ")
	public List<CustomerEntity> validateCustomer(@Param("name") String name, @Param("email") String eamil);
}
