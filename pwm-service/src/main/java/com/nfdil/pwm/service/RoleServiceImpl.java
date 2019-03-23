package com.nfdil.pwm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndfil.pwm.entity.entities.MstRole;
import com.nfdil.pwm.repository.MstRoleRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService{
	
	
	@Autowired
	MstRoleRepository mstRoleRepository;

	@Override
	public List<String> getMstRoleName() {
		log.info("RoleServiceImpl request");
		List<String> roleNames = new ArrayList<>();
		try {
			List<MstRole> listStores =  mstRoleRepository.findAll();
			
			for (MstRole mstRole : listStores) {
				 roleNames.add(mstRole.getRoleName());
			}
		}
		catch (Exception e) {
			log.info("Exception in RoleServiceImpl");
			e.printStackTrace();
		}
		return roleNames;
	}
}
