package org.mani.CutomerDataManagement.repository;

import java.util.List;

import org.mani.CutomerDataManagement.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
	List<PersonEntity> findByName(String name);
	List<PersonEntity> findByEmail(String email);
}
