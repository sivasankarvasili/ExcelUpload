package com.excel.upload.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.excel.upload.model.DATASALES;
import com.excel.upload.model.Entity_DATA;
import com.excel.upload.model.MDTSALES;
import com.excel.upload.service.ExcelUploadService;


@RestController
public class ExcelUploadController {
	
	@Autowired
	ExcelUploadService service;
	List<Entity_DATA> entity_list=new ArrayList<Entity_DATA>();
	List<MDTSALES> mdtsales_list=new ArrayList<MDTSALES>();
	List<DATASALES> datasales_list=new ArrayList<DATASALES>();
	
	@Value("${excelfile}")
    private String excelfile;
	@PostMapping("/api/upload")
	public String uploadExcel(@PathVariable("file") MultipartFile file,RedirectAttributes redirectAttributes)throws IOException{
		//System.out.println(excelfile);
		//to read the excel file 
		  FileInputStream inputStream = new FileInputStream(new File(excelfile));
		//to create worlkbook 
		  Workbook workbook = new XSSFWorkbook(inputStream);
		  int sheetNo=workbook.getNumberOfSheets();
		  System.out.println(sheetNo);
		//to read first sheet
		  Sheet sheet = workbook.getSheetAt(0);
		  entity_list=getEntityList(sheet);
		//to read second sheet
		  Sheet sheet1 = workbook.getSheetAt(1);
		  mdtsales_list= getMDTSALESList(sheet1);
		//to read third sheet
		  Sheet sheet2 = workbook.getSheetAt(2);
		  datasales_list= getDATASALESList(sheet2);
		//to pass data to service layer
		  service.saveEntityData(entity_list);
		  service.saveMdtSales(mdtsales_list);
		  service.saveDataSales(datasales_list);
		  //close the resources
		  workbook.close();
		  inputStream.close();
	 return "File Uploaded Successfully into the Database";	
	}
	//one way to generate JSON object
	@GetMapping("/api/getentity")
	public List<Entity_DATA> getEntityList(){
		
		return service.getEntityList();
	}
	@GetMapping("/api/getmdtsales")
	public List<MDTSALES> getMDTSales(){
		return service.getMDTList();
	}
	@GetMapping("/api/getdatasales")
	public List<DATASALES> getDataSales(){
		return service.getDATAList();
	}
	
	//another way to generate json object
	/*@GetMapping("/api/getentity")
	public String getEntityList(){
		String json=new Gson().toJson(entity_list);
		return json;
	}
	@GetMapping("/api/getmdtsales")
	public String getMDTSales(){
		String json=new Gson().toJson(mdtsales_list);
		return json;
	}
	@GetMapping("/api/getdatasales")
	public String getDataSales(){
		String json=new Gson().toJson(datasales_list);
		return json;
	}*/
	//to read the entity data
	private List<Entity_DATA> getEntityList(Sheet sheet){
		List<Entity_DATA> entity_list=new ArrayList();
		// to iterate sheet1
		  Iterator iterator = sheet.iterator();
		//to read  entity data
		  
		  while (iterator.hasNext()) {
			  Entity_DATA ent=new Entity_DATA();
		      Row nextRow = (Row) iterator.next();
		      Iterator cellIterator = nextRow.cellIterator();
		   //to iterate each cell   
		   while (cellIterator.hasNext()) {
			
		    Cell cell = (Cell) cellIterator.next();
		    int columnIndex = cell.getColumnIndex();
		    //to check each column value
		    switch(columnIndex){
		    	case 0:ent.setEntity_id((String) getCellValue(cell));
		    	break;
		    	case 1:ent.setEin((Double) getCellValue(cell));
		    	break;
		    	case 2:ent.setEntity_name((String) getCellValue(cell));
		    	break;
		    	case 3:ent.setEntity_type((String) getCellValue(cell));
		    	break;
		    	case 4:ent.setExternal_entity((String) getCellValue(cell));
		    	break;
		    	case 5:ent.setFiscal_year_id((String) getCellValue(cell));
		    	break;
		    	case 6:ent.setTenant_id((String) getCellValue(cell));
		    	break;
		    	case 7:ent.setUpdated_by((String) getCellValue(cell));
		    	break;
		    	case 8:ent.setUpdate_date( (String) getCellValue(cell));
		    	break;
		    	
		    }
		    
		   }
		   entity_list.add(ent);
		  }
		return entity_list;
	}
	
	
	private List<MDTSALES> getMDTSALESList(Sheet sheet){
		List<MDTSALES> sales=new ArrayList();
		// to iterate sheet1
		  Iterator iterator = sheet.iterator();
		//to read  entity data
		  
		  while (iterator.hasNext()) {
			  MDTSALES ent=new MDTSALES();
		      Row nextRow = (Row) iterator.next();
		      Iterator cellIterator = nextRow.cellIterator();
		 
		   while (cellIterator.hasNext()) {
		    Cell cell = (Cell) cellIterator.next();
		    int columnIndex = cell.getColumnIndex();
		  //to check each column value
		    switch(columnIndex){
		    	case 0:ent.setSales_category_id((String) getCellValue(cell));
		    	break;
		    	case 1:ent.setFactor_name((String) getCellValue(cell));
		    	break;
		    	case 2:ent.setFactor_cat_desc((String) getCellValue(cell));
		    	break;
		    	case 3:ent.setFiscal_year_id((String) getCellValue(cell));
		    	break;
		    	
		    	case 4:ent.setTenant_id((String) getCellValue(cell));
		    	break;
		    	case 5:ent.setUpdated_by((String) getCellValue(cell));
		    	break;
		    	case 6:ent.setUpdate_date( (String) getCellValue(cell));
		    	break;
		    	
		    }
		    
		   }
		   sales.add(ent);
		  }
		return sales;
	}
	
	
	
	private List<DATASALES> getDATASALESList(Sheet sheet){
		List<DATASALES> sales=new ArrayList<>();
		// to iterate sheet1
		  Iterator iterator = sheet.iterator();
		//to read  entity data
		  
		  while (iterator.hasNext()) {
			  DATASALES ent=new DATASALES();
		      Row nextRow = (Row) iterator.next();
		      Iterator cellIterator = nextRow.cellIterator();
		 //to iterate each row
		   while (cellIterator.hasNext()) {
		    Cell cell = (Cell) cellIterator.next();
		    int columnIndex = cell.getColumnIndex();
		  //to check each column value
		    switch(columnIndex){
		    	case 0:ent.setSales_data_id((String) getCellValue(cell));
		    	break;
		    	case 1:ent.setFactor((String) getCellValue(cell));
		    	break;
		    	case 2:ent.setFactory_category((String) getCellValue(cell));
		    	break;
		    	case 3:ent.setCtegory_desc((String) getCellValue(cell));
		    	break;
		    	case 4:ent.setEntity_id((String) getCellValue(cell));
		    	break;
		    	case 5:ent.setJurisdiction((String) getCellValue(cell));
		    	break;
		    	case 6:ent.setBeg_bal((Double) getCellValue(cell));
		    	break;
		    	case 7:ent.setEnd_bal((Double) getCellValue(cell));
		    	break;
		    	case 8:ent.setSource_system((String) getCellValue(cell));
		    	break;
		    	case 9:ent.setAccount_type((String) getCellValue(cell));
		    	break;
		    	
		    	
		    	case 10:ent.setFiscal_year_id((String) getCellValue(cell));
		    	break;
		    	case 11:ent.setScenario_id((String) getCellValue(cell));
		    	break;
		    	
		    	case 12:ent.setTenant_id((String) getCellValue(cell));
		    	break;
		    	case 13:ent.setUpdated_by((String) getCellValue(cell));
		    	break;
		    	case 14:ent.setUpdate_date( (String) getCellValue(cell));
		    	break;
		    	
		    }
		    
		   }
		   sales.add(ent);
		  }
		return sales;
	}
	
	//to read each cell object
	private Object getCellValue(Cell cell) {
	    switch (cell.getCellType()) {
	    case Cell.CELL_TYPE_STRING:
	        return cell.getStringCellValue();
	 
	    case Cell.CELL_TYPE_BOOLEAN:
	        return cell.getBooleanCellValue();
	 
	    case Cell.CELL_TYPE_NUMERIC:
	        return cell.getNumericCellValue();
	    }
	 
	    return null;
	}
}
