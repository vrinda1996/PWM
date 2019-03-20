package com.nfdil.pwm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nfdil.pwm.common.dto.OrgMasterDto;

@Service
public interface OrgMasterService {
	public List<OrgMasterDto> getOrganizationDetails();

}
