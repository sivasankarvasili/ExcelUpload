package com.excel.upload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.upload.model.DATASALES;
import com.excel.upload.model.Entity_DATA;
import com.excel.upload.model.MDTSALES;
import com.excel.upload.repositories.DataSalesRepository;
import com.excel.upload.repositories.EntityDataRepository;
import com.excel.upload.repositories.MDTSalesRepository;

@Service
public class ExcelUploadService {
	@Autowired
	private MDTSalesRepository mdtSalesRepository;
	@Autowired
	private DataSalesRepository dataSalesRepository;
	@Autowired
	private EntityDataRepository entityDataRepository;
	
	public void saveEntityData(List<Entity_DATA> list){
		 entityDataRepository.save(list);
	}
	public void saveMdtSales(List<MDTSALES> list){
		 mdtSalesRepository.save(list);
	}
	public void saveDataSales(List<DATASALES> list){
		 dataSalesRepository.save(list);
	}
	public List<Entity_DATA> getEntityList(){
		return entityDataRepository.findAll();
	}
	public List<MDTSALES> getMDTList(){
		return mdtSalesRepository.findAll();
	}
	public List<DATASALES> getDATAList(){
		return dataSalesRepository.findAll();
	}
	

}
