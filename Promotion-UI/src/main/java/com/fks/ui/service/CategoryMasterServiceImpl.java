package com.fks.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fks.promo.entity.Mch;
import com.fks.ui.dto.CategoryMasterDto;
import com.fks.ui.repository.CategoryMasterRepository;

@Service
public class CategoryMasterServiceImpl implements CategoryMasterService{
	private static final Logger logger = LogManager.getLogger(CategoryMasterServiceImpl.class.getName());

	@Autowired
	private CategoryMasterRepository categoryMasterRepository;
	
	@Override
	public List<CategoryMasterDto> getCategoryMasterList() {
		logger.info("---Inside getCategoryMasterList----------");
		List<Mch> list=categoryMasterRepository.findAll();
		 List<CategoryMasterDto> listMCH = new ArrayList<CategoryMasterDto>();
         CategoryMasterDto mCHVo = null;
         for (Mch mch : list) {
             mCHVo = new CategoryMasterDto();
             mCHVo.setCategoryName(mch.getCategoryName());
             mCHVo.setMcCode(mch.getMcCode());
             mCHVo.setMcName(mch.getMcName());
             mCHVo.setSubCategoryName(mch.getSubCategoryName());
             if (mch.getMstLocation() != null) {
                 mCHVo.setLocationID(Long.valueOf(mch.getMstLocation().getLocationId()));
                 mCHVo.setLocationName(mch.getMstLocation().getLocationName());
             }
             mCHVo.setIsMCActive(mch.getIsBlocked());
             listMCH.add(mCHVo);
         }

		return listMCH;
	}
 	
}
