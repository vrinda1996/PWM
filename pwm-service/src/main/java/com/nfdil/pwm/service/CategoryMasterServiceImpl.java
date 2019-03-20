package com.nfdil.pwm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndfil.pwm.entity.entities.Mch;
import com.nfdil.pwm.common.dto.CategoryMasterDto;
import com.nfdil.pwm.repository.CategoryMasterRepository;

@Service
public class CategoryMasterServiceImpl implements CategoryMasterService {
	private static final Logger logger = LogManager.getLogger(CategoryMasterServiceImpl.class.getName());

	@Autowired
	private CategoryMasterRepository categoryMasterRepository;

	@Override
	public List<CategoryMasterDto> getCategoryMasterList() {
		logger.info("---Inside getCategoryMasterList----------");
		List<Mch> list = categoryMasterRepository.findAll();
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
			if (mch.getIsBlocked() != null) {
				if (mch.getIsBlocked())
					mCHVo.setIsMCActive("Blocked");
				else
					mCHVo.setIsMCActive("Active");
			}
			listMCH.add(mCHVo);
		}

		return listMCH;
	}

}
