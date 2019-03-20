package com.nfdil.pwm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndfil.pwm.entity.entities.MstStore;
import com.nfdil.pwm.common.dto.OrgMasterDto;
import com.nfdil.pwm.repository.OrgMasterRepository;

@Service
public class OrgMasterServiceImpl implements OrgMasterService {
	private static final Logger logger = LogManager.getLogger(OrgMasterServiceImpl.class.getName());

	@Autowired
	OrgMasterRepository orgMasterRepository;

	@Override
	public List<OrgMasterDto> getOrganizationDetails() {
		logger.info("---Inside getOrganizationDetails----");
		try {
		List<MstStore> listStores = orgMasterRepository.getStoreDetails();
		List<OrgMasterDto> storeVOList = new ArrayList<OrgMasterDto>();
		OrgMasterDto storeVO = null;
		for (MstStore ms : listStores) {
			storeVO = new OrgMasterDto();
			storeVO.setCity(ms.getCity());
			if (ms.getMstEmployee() != null) {
				storeVO.setCreatedByID(ms.getMstEmployee().getEmpId());
				storeVO.setCreatedByName(ms.getMstEmployee().getEmployeeName());
			}
			storeVO.setFormat(ms.getFormatName());
			if (ms.getMstLocation() != null) {
				storeVO.setLocationID(ms.getMstLocation().getLocationId());
				storeVO.setLocationName(ms.getMstLocation().getLocationName());
			}
			storeVO.setRegion(ms.getRegionName());
			storeVO.setState(ms.getState());
			storeVO.setStoreClass(ms.getStoreClass());
			storeVO.setStoreID(ms.getMstStoreId());
			storeVO.setStoreDesc(ms.getSiteDescription());
			if (ms.getMstZone() != null) {
				storeVO.setZoneId(ms.getMstZone().getZoneId());
				storeVO.setZoneName(ms.getMstZone().getZoneName());
				storeVO.setZoneCode(ms.getMstZone().getZoneCode());
			}
			if (ms.getIsBlocked() != null) {
				if(ms.getIsBlocked())
					storeVO.setIsStoreBlocked("Blocked");
				else
					storeVO.setIsStoreBlocked("Active");
			}
			storeVOList.add(storeVO);
		}
		return storeVOList;
	  }catch(Exception e){
		  logger.info("Exception in orgDetails");
		  e.printStackTrace();
		  return null;
	  }
	}

}
