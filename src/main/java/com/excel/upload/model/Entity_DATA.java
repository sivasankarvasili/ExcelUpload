package com.excel.upload.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ENTITY_DATA")
public class Entity_DATA {
	@Id
	@Column(name="ENTITY_ID")
	private String entity_id;
	@Column(name="EIN")
	private Double ein;
	@Column(name="ENTITY_NAME")
	private String entity_name;
	@Column(name="ENTITY_TYPE")
	private String entity_type;
	@Column(name="EXTERNAL_ENTITY")
	private String external_entity;
	@Column(name="FISCAL_YEAR_ID")
	private String fiscal_year_id;
	@Column(name="TENANT_ID")
	private String tenant_id;
	@Column(name="UPDATED_BY")
	private String updated_by;
	@Column(name="UPDATE_DATE")
	private String update_date;
	//getters and setters
	public String getEntity_id() {
		return entity_id;
	}
	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}
	public Double getEin() {
		return ein;
	}
	public void setEin(Double ein) {
		this.ein = ein;
	}
	public String getEntity_name() {
		return entity_name;
	}
	public void setEntity_name(String name) {
		this.entity_name = name;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public String getExternal_entity() {
		return external_entity;
	}
	public void setExternal_entity(String external_entity) {
		this.external_entity = external_entity;
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
		return "Entity [entity_id=" + entity_id + ", ein=" + ein + ", entity_name=" + entity_name + ", entity_type="
				+ entity_type + ", external_entity=" + external_entity + ", fiscal_year_id=" + fiscal_year_id
				+ ", tenant_id=" + tenant_id + ", updated_by=" + updated_by + ", update_date=" + update_date + "]";
	}
	

}
