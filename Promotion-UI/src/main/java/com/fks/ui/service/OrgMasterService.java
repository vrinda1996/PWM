package com.fks.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.fks.ui.dto.OrgMasterDto;

@Service
public interface OrgMasterService {
	public List<OrgMasterDto> getOrganizationDetails();

}
