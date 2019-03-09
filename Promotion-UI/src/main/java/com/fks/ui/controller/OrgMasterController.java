package com.fks.ui.controller;

import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fks.ui.dto.OrgMasterDto;
import com.fks.ui.service.OrgMasterService;

import lombok.Data;

@RestController
@RequestMapping("/organizationApi")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@Data
public class OrgMasterController {

	@Autowired
	private OrgMasterService orgMasterService;
	private HttpServletResponse response;
    private static Logger logger=Logger.getLogger(OrgMasterController.class.getName());	
	@RequestMapping("/orgList")
	@ResponseBody
	public List<OrgMasterDto> getOrgMasterData() {
	   List<OrgMasterDto> storeVo= orgMasterService.getOrganizationDetails();
	   return storeVo;
	}
}
