package com.excel.upload.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DATA_SALES")

public class DATASALES {
	@Id
	@Column(name="SALES_DATA_ID")
	private String sales_data_id;
	@Column(name="FACTOR")
	private String factor;
	@Column(name="FACTORY_CATEGORY")
	private String factory_category;
	@Column(name="CATEGORY_DESC")
	private String ctegory_desc;
	@Column(name="ENTITY_ID")
	private String entity_id;
	@Column(name="JURISDICTION")
	private String jurisdiction;
	@Column(name="BEG_BAL")
	private Double beg_bal;
	@Column(name="END_BAL")
	private Double end_bal;
	@Column(name="SOURCE_SYSTEM")
	private String source_system;
	@Column(name="ACCOUNT_TYPE")
	private String account_type;
	@Column(name="FISCAL_YEAR_ID")
	private String fiscal_year_id;
	@Column(name="SCENARIO_ID")
	private String scenario_id;
	@Column(name="TENANT_ID")
	private String tenant_id;
	@Column(name="UPDATED_BY")
	private String updated_by;
	@Column(name="UPDATE_DATE")
	private String update_date;
	@Column(name="REMARK")
	private String remark;
	//getters and setters
	public String getSales_data_id() {
		return sales_data_id;
	}
	public void setSales_data_id(String sales_data_id) {
		this.sales_data_id = sales_data_id;
	}
	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
	public String getFactory_category() {
		return factory_category;
	}
	public void setFactory_category(String factory_category) {
		this.factory_category = factory_category;
	}
	public String getCtegory_desc() {
		return ctegory_desc;
	}
	public void setCtegory_desc(String ctegory_desc) {
		this.ctegory_desc = ctegory_desc;
	}
	public String getEntity_id() {
		return entity_id;
	}
	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public Double getBeg_bal() {
		return beg_bal;
	}
	public void setBeg_bal(Double beg_bal) {
		this.beg_bal = beg_bal;
	}
	public double getEnd_bal() {
		return end_bal;
	}
	public void setEnd_bal(Double end_bal) {
		this.end_bal = end_bal;
	}
	public String getSource_system() {
		return source_system;
	}
	public void setSource_system(String source_system) {
		this.source_system = source_system;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getFiscal_year_id() {
		return fiscal_year_id;
	}
	public void setFiscal_year_id(String fiscal_year_id) {
		this.fiscal_year_id = fiscal_year_id;
	}
	public String getScenario_id() {
		return scenario_id;
	}
	public void setScenario_id(String scenario_id) {
		this.scenario_id = scenario_id;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "DATASALES [sales_data_id=" + sales_data_id + ", factor=" + factor + ", factory_category="
				+ factory_category + ", ctegory_desc=" + ctegory_desc + ", entity_id=" + entity_id + ", jurisdiction="
				+ jurisdiction + ", beg_bal=" + beg_bal + ", end_bal=" + end_bal + ", source_system=" + source_system
				+ ", account_type=" + account_type + ", fiscal_year_id=" + fiscal_year_id + ", scenario_id="
				+ scenario_id + ", tenant_id=" + tenant_id + ", updated_by=" + updated_by + ", update_date="
				+ update_date + ", remark=" + remark + "]";
	}
	
	//to string
	


}
