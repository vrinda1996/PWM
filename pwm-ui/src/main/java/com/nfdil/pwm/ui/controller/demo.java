package com.nfdil.pwm.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class demo {
	
//	@Autowired
//	private CategoryMasterService categoryMasterService;
	
	@GetMapping("index")
	public ModelAndView menuPage() {
		System.err.println("vrinda");
		return new ModelAndView("menu/menuPage");
	}
/*	@RequestMapping("/category")
	@ResponseBody
	public List<CategoryMasterDto> getCategoryMasterData() {
		System.out.println("check--");
	   List<CategoryMasterDto> categoryVo= categoryMasterService.getCategoryMasterList();
	   System.out.println("size is ==="+ categoryVo.size());
		return categoryVo;
	}
	*/
	
}
