package com.nfdil.pwm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndfil.pwm.entity.entities.Mch;


@Repository
public interface CategoryMasterRepository extends JpaRepository<Mch, String> {

	
	
}
