package com.fks.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMasterDto {
	 private String mcCode;
	 private String mcName;
	 private String categoryName;
	 private String subCategoryName;
	 private String createdBy;
	 private Long locationID;
	 private String locationName;
	 private String isMCActive;
   //added by vrinda --start
	 private String updatedDate;
	 private String updatedBy;
   //added by vrinda --end
}
