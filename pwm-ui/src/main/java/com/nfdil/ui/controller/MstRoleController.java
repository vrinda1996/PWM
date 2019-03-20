package com.nfdil.ui.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nfdil.pwm.service.RoleService;

@RestController
@RequestMapping("/roleAPI")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MstRoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/getRole")
	@ResponseBody
	public List<String> getRoleName() {
		System.out.print("getRoleName");
		List<String> roleVo = roleService.getMstRoleName();
		System.out.print("getRoleName "+roleVo.get(0));
		return roleVo;
	}
	
}
