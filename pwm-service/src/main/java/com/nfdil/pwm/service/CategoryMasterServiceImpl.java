package com.nfdil.pwm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndfil.pwm.entity.entities.Mch;
import com.nfdil.pwm.common.dto.CategoryMasterDto;
import com.nfdil.pwm.repository.CategoryMasterRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryMasterServiceImpl implements CategoryMasterService {

	@Autowired
	private CategoryMasterRepository categoryMasterRepository;

	@Override
	public List<CategoryMasterDto> getCategoryMasterList() {
		log.info("---Inside getCategoryMasterList----------");
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
