package com.fks.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrgMasterDto {
	private String storeID;
    private String storeDesc;
    private String region;
    private String state;
    private String city;
    private String format;
    private String storeClass;
    private Long createdByID;
    private String createdByName;
    private Long ZoneId;
    private String ZoneName;
    private String zoneCode;
    private Long LocationID;
    private String LocationName;
    private String isStoreBlocked;
}
