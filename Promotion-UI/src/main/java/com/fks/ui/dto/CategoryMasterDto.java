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
	 public String mcCode;
	 public String mcName;
	 public String categoryName;
	 public String subCategoryName;
	 public String createdBy;
	 public Long locationID;
	 public String locationName;
	 public Boolean isMCActive;
   //added by vrinda --start
	 public String updatedDate;
	 public String updatedBy;
   //added by vrinda --end
}
