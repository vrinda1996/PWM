package com.nfdil.pwm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndfil.pwm.entity.entities.MstRole;
import com.nfdil.pwm.repository.MstRoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	private static final Logger logger = LogManager.getLogger(RoleServiceImpl.class.getName());
	
	@Autowired
	MstRoleRepository mstRoleRepository;

	@Override
	public List<String> getMstRoleName() {
		logger.info("RoleServiceImpl");
		List<String> roleNames = new ArrayList<>();
		try {
			List<MstRole> listStores =  mstRoleRepository.findAll();
			
			for (MstRole mstRole : listStores) {
				 roleNames.add(mstRole.getRoleName());
			}
		}
		catch (Exception e) {
			logger.info("Exception in RoleServiceImpl");
			e.printStackTrace();
		}
		return roleNames;
	}
}
