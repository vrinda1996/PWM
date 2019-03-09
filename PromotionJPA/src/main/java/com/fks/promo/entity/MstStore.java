package com.fks.promo.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the mst_store database table.
 * 
 */
@Entity
@Table(name="mst_store")
@NamedQuery(name="MstStore.findAll", query="SELECT m FROM MstStore m")
public class MstStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Basic(optional = false)
    @Column(name = "mst_store_id")
    private String mstStoreId;
    @Column(name = "region_name")
    private String regionName;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "site_description")
    private String siteDescription;
    @Column(name = "format_name")
    private String formatName;
    @Column(name = "store_class")
    private String storeClass;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @Column(name = "is_blocked")
    private Boolean isBlocked;
    @JoinColumn(name = "created_by", referencedColumnName = "emp_id")
    @ManyToOne
    private MstEmployee mstEmployee;
    @JoinColumn(name = "mst_zone_id", referencedColumnName = "zone_id")
    @ManyToOne
    private MstZone mstZone;
    @JoinColumn(name = "mst_location_id", referencedColumnName = "location_id")
    @ManyToOne
    private MstLocation mstLocation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mstStore")
    private Collection<MapPromoStore> mapPromoStoreCollection;
    @OneToMany(mappedBy = "mstStore")
    private Collection<MstEmployee> mstEmployeeCollection;

    public MstStore() {
    }

    public MstStore(String mstStoreId) {
        this.mstStoreId = mstStoreId;
    }

    public String getMstStoreId() {
        return mstStoreId;
    }

    public void setMstStoreId(String mstStoreId) {
        this.mstStoreId = mstStoreId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public String getStoreClass() {
        return storeClass;
    }

    public void setStoreClass(String storeClass) {
        this.storeClass = storeClass;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public MstEmployee getMstEmployee() {
        return mstEmployee;
    }

    public void setMstEmployee(MstEmployee mstEmployee) {
        this.mstEmployee = mstEmployee;
    }

    public MstZone getMstZone() {
        return mstZone;
    }

    public void setMstZone(MstZone mstZone) {
        this.mstZone = mstZone;
    }

    public MstLocation getMstLocation() {
        return mstLocation;
    }

    public void setMstLocation(MstLocation mstLocation) {
        this.mstLocation = mstLocation;
    }

    public Collection<MapPromoStore> getMapPromoStoreCollection() {
        return mapPromoStoreCollection;
    }

    public void setMapPromoStoreCollection(Collection<MapPromoStore> mapPromoStoreCollection) {
        this.mapPromoStoreCollection = mapPromoStoreCollection;
    }

    public Collection<MstEmployee> getMstEmployeeCollection() {
        return mstEmployeeCollection;
    }

    public void setMstEmployeeCollection(Collection<MstEmployee> mstEmployeeCollection) {
        this.mstEmployeeCollection = mstEmployeeCollection;
    }
}