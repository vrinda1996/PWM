package com.nfdil.pwm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ndfil.pwm.entity.entities.MstStore;

@Repository
public interface OrgMasterRepository extends JpaRepository<MstStore, String>{

	@Query("select t from MstStore t")
	public List<MstStore> getStoreDetails();
}
