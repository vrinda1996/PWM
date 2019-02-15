package com.fks.ui.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.fks.ui.dto.CategoryMasterDto;

@Service
public interface CategoryMasterService {
	public List<CategoryMasterDto> getCategoryMasterList();
}
