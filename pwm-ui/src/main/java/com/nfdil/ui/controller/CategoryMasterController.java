package com.nfdil.ui.controller;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nfdil.pwm.common.dto.CategoryMasterDto;
import com.nfdil.pwm.service.CategoryMasterService;

import lombok.Data;

@RestController
@RequestMapping("/categoryApi")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@Data
public class CategoryMasterController {

	@Autowired
	private CategoryMasterService categoryMasterService;

	private HttpServletResponse response;

	private static Logger logger = Logger.getLogger(CategoryMasterController.class.getName());

	@RequestMapping("/category")
	@ResponseBody
	public List<CategoryMasterDto> getCategoryMasterData() {
		System.out.println("check--");
		List<CategoryMasterDto> categoryVo = categoryMasterService.getCategoryMasterList();
		System.out.println("size is ===" + categoryVo.get(0).getCategoryName());
		return categoryVo;
	}

	@RequestMapping("/downloadCategorySampleFile")
	public void downloadSampleCategoryFile() {
		logger.info("==== Inside Download Sample Category MCH File..");
		try {
			StringBuilder sb = new StringBuilder();
			String fileName = "";
			fileName = "Category_MCH_sample.csv";
			sb.append("Category");
			sb.append(",");
			sb.append("Sub Category");
			sb.append(",");
			sb.append("MC Code");
			sb.append(",");
			sb.append("MC Name");
			sb.append("\n");

			byte requestBytes[] = sb.toString().getBytes();
			ByteArrayInputStream bis = new ByteArrayInputStream(requestBytes);

			response.setContentType("text/csv");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);
			byte[] buf = new byte[1024];
			int len;

			while ((len = bis.read(buf)) > 0) {
				response.getOutputStream().write(buf, 0, len);
			}
			bis.close();
			response.getOutputStream().flush();
			logger.info("====== File Writing is Completed ===== ");
		} catch (Exception ex) {
			logger.info("Exception :" + ex.getMessage());
		}
	}
}
