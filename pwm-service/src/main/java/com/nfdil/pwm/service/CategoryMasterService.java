package com.nfdil.pwm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nfdil.pwm.common.dto.CategoryMasterDto;

@Service
public interface CategoryMasterService {
	public List<CategoryMasterDto> getCategoryMasterList();
}
