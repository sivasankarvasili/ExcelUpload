package com.excel.upload.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
@Entity
@Table(name="MDT_SALES")
public class MDTSALES {
	
	@Id
	@Column(name="SALES_CATEGORY_ID")
	private String sales_category_id;
	@Column(name="FACTOR_NAME")
	private String factor_name;
	@Column(name="FACTOR_CAT_DESC")
	private String factor_cat_desc;
	@Column(name="FISCAL_YEAR_ID")
	private String fiscal_year_id;
	@Column(name="TENANT_ID")
	private String tenant_id;
	@Column(name="UPDATED_BY")
	private String updated_by;
	@Column(name="UPDATE_DATE")
	private String update_date;
	//setters and getters
	public String getSales_category_id() {
		return sales_category_id;
	}
	public void setSales_category_id(String sales_category_id) {
		this.sales_category_id = sales_category_id;
	}
	public String getFactor_name() {
		return factor_name;
	}
	public void setFactor_name(String factor_name) {
		this.factor_name = factor_name;
	}
	public String getFactor_cat_desc() {
		return factor_cat_desc;
	}
	public void setFactor_cat_desc(String factor_cat_desc) {
		this.factor_cat_desc = factor_cat_desc;
	}
	public String getFiscal_year_id() {
		return fiscal_year_id;
	}
	public void setFiscal_year_id(String fiscal_year_id) {
		this.fiscal_year_id = fiscal_year_id;
	}
	public String getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String string) {
		this.update_date = string;
	}
	//to string
	@Override
	public String toString() {
		return "MDTSALES [sales_category_id=" + sales_category_id + ", factor_name=" + factor_name
				+ ", factor_cat_desc=" + factor_cat_desc + ", fiscal_year_id=" + fiscal_year_id + ", tenant_id="
				+ tenant_id + ", updated_by=" + updated_by + ", update_date=" + update_date + "]";
	}
	

}
