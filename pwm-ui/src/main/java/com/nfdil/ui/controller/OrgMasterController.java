package com.nfdil.ui.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nfdil.pwm.common.dto.OrgMasterDto;
import com.nfdil.pwm.service.OrgMasterService;

import lombok.Data;

@RestController
@RequestMapping("/organizationApi")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@Data
public class OrgMasterController {

	@Autowired
	private OrgMasterService orgMasterService;

	private HttpServletResponse response;
	
	
	@RequestMapping("/orgList")
	@ResponseBody
	public List<OrgMasterDto> getOrgMasterData() {
	   List<OrgMasterDto> storeVo= orgMasterService.getOrganizationDetails();
	   return storeVo;
	}
}
