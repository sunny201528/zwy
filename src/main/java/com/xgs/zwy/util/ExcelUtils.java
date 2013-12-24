package com.xgs.zwy.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.xgs.zwy.constant.Constants;
import com.xgs.zwy.domain.CDEntryHead;
import com.xgs.zwy.domain.CDHead;


public class ExcelUtils {

	private ExcelUtils() {
	}
public static ExcelUtils newInstance(){
	return new ExcelUtils();
}
	public CDHead  readExcel(String fileName,CDHead cdHead) throws Exception{
		File file = new File(fileName);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getSheetName());
		/*Row row = sheet.getRow(1);
		EntryHead head = new EntryHead();
		head.setBillNO(getCellData(row.getCell(0)).toString());
		String i_E_Flag = getCellData(row.getCell(1)).toString();
		head.setI_E_Flag(i_E_Flag);
		head.setVoyageNO(getCellData(row.getCell(1)).toString());*/
		List<CDEntryHead> heads = new ArrayList<CDEntryHead>();
		int lastIndex = sheet.getLastRowNum();
		for (int i = 1; i <=lastIndex; i++) {
			Row tmp = sheet.getRow(i);
//			System.out.println(i+1+" 行：");
			if(tmp==null)
				continue;
			Cell Cel_0 =tmp.getCell(0);
			
			if(Cel_0==null)
				continue;
			String assBillNO =getCellData(Cel_0).toString();
			if(assBillNO==null||assBillNO.trim().length()==0)
				continue;
			CDEntryHead head =excelValue2Head(tmp);
			head.setCdHead(cdHead);
			heads.add(head);
		}
		cdHead.setEntryHead(heads);
		return cdHead;
	}
	
	private CDEntryHead excelValue2Head(Row tmp){
		
		CDEntryHead head = new CDEntryHead();
		//分运单号
		Object  billNO = getCellData(tmp.getCell(0));
		if(billNO instanceof Number){
			head.setAssBillNO(((Number)billNO).longValue()+"");
		}else{
			head.setAssBillNO(billNO.toString());
		}
		 
		 head.setgName_en(getCellData(tmp.getCell(1)).toString());
		 head.setgName_cn(getCellData(tmp.getCell(2)).toString());
			Object  codeTS = getCellData(tmp.getCell(3));
			if(codeTS instanceof Number){
				head.setCodeTS(((Number)codeTS).longValue()+"");
			}else{
				head.setCodeTS(codeTS.toString());
			}
		 head.setgModel(getCellData(tmp.getCell(4)).toString());
		 head.setgQty(getCellData(tmp.getCell(5)).toString());
		 head.setPackNO((((Number)getCellData(tmp.getCell(6))).intValue()));
		 head.setgGrossWt((((Number)getCellData(tmp.getCell(7))).doubleValue()));
		 head.setDeclTotal(getCellData(tmp.getCell(8)).toString());
		
			Object  currCode = getCellData(tmp.getCell(9));
			if(currCode instanceof Number){
				head.setCurrCode(((Number)currCode).intValue());
			}else{
				head.setCurrCode(Integer.parseInt(currCode.toString()));
			}
		 head.setSendName(getCellData(tmp.getCell(10)).toString());
		 head.setReceiveName(getCellData(tmp.getCell(11)).toString());
		 Object  sendCountry = getCellData(tmp.getCell(12));
		 if(sendCountry instanceof Number){
				head.setSendCountry(((Number)sendCountry).intValue());
			}else{
				try {
					head.setSendCountry(Integer.parseInt(sendCountry.toString()));
				} catch (Exception e) {
					head.setSendCountry(Integer.parseInt(Constants.COUNTRY.get(sendCountry.toString().trim())));
				}
			}
		
		 head.setSendCity(getCellData(tmp.getCell(13)).toString());
		
		 Object  entryType = getCellData(tmp.getCell(14));
		 if(sendCountry instanceof Number){
				head.setEntryType(((Number)entryType).intValue());
			}else{
				head.setEntryType(Integer.parseInt(entryType.toString()));
			}
			Object  tradeCO = getCellData(tmp.getCell(15));
			if(tradeCO instanceof Number){
				head.setTradeCO(((Number)tradeCO).longValue()+"");
			}else{
				head.setTradeCO(tradeCO.toString());
			}
		 head.setTradeName(getCellData(tmp.getCell(16)).toString());
		 return head;
	}
	
	private Object getCellData(Cell cell) {
	    if(cell == null) {
	        return "";
	    }
	    switch (cell.getCellType()) {
	    case Cell.CELL_TYPE_STRING:
	        return cell.getRichStringCellValue().getString();
	    case Cell.CELL_TYPE_NUMERIC:
	            return cell.getNumericCellValue();
	    case Cell.CELL_TYPE_BOOLEAN:
	        return cell.getBooleanCellValue();
	    case Cell.CELL_TYPE_FORMULA:
	        return cell.getCellFormula();
	    default:
	        return "";
	    }
	}
}
