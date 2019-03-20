package com.nfdil.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class demo {
	
//	@Autowired
//	private CategoryMasterService categoryMasterService;
	
	@RequestMapping("index")
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
