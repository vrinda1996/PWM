package com.fks.ui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fks.promo.entity.Mch;

@Repository

public interface CategoryMasterRepository extends JpaRepository<Mch, String> {

	
	
}
