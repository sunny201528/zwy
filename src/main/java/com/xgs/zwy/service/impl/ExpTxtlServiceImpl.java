package com.xgs.zwy.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.xgs.zwy.dao.CDEntryHeadDao;
import com.xgs.zwy.dao.CDHeadDao;
import com.xgs.zwy.dao.impl.CDEntryHeadDaoImpl;
import com.xgs.zwy.dao.impl.CDHeadDaoImpl;
import com.xgs.zwy.domain.CDEntryHead;
import com.xgs.zwy.domain.CDHead;
import com.xgs.zwy.service.ExpTxtService;
import com.xgs.zwy.util.ExcelUtils;
import com.xgs.zwy.vo.CDEntryListVo;
import com.xgs.zwy.vo.SystemSettingValidate;


/**
 * xml报文的父类
 * 
 * @author n-194
 * 
 */
public  class ExpTxtlServiceImpl implements ExpTxtService {

	private CDEntryHeadServiceImpl entryHeadService = new CDEntryHeadServiceImpl();
	private static String DEFAULT_ENCODING = "GBK";
	
	@Override
	public CDHead readExcel(String inPath, CDHead cdHead) throws Exception {
		cdHead = ExcelUtils.newInstance().readExcel(inPath,cdHead);
		return cdHead;
	}
	
	@Override
	public void createExpTxt( String outPath,CDHead cdHead) throws Exception {
		boolean isImport = false;//是否为进口
		if("I".equalsIgnoreCase(cdHead.getI_E_Flag())){
			isImport = true ;
		}
		BufferedWriter cdWriter = null;
		if(isImport){
			File cdFile = new File(outPath+File.separator+cdHead.getBillNO()+"cd.txt");
		    cdWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cdFile),DEFAULT_ENCODING));
			cdWriter.append(cdHead.toCDString());
			cdWriter.newLine();
		}
		File bgFile = new File(outPath+File.separator+cdHead.getBillNO()+"bg.txt");
		List<CDEntryHead> heads = cdHead.getEntryHead();
		BufferedWriter bgWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(bgFile),DEFAULT_ENCODING));
		for (CDEntryHead cdEntryHead : heads) {
			if(isImport){
			createCdTxt(cdEntryHead, cdWriter);
			}
			CDEntryHead cdEntryHead_old = entryHeadService.findByAssBillNO(cdEntryHead.getAssBillNO());
			if(cdEntryHead_old!=null){
				if(isImport){
					cdWriter.close();
					new File(outPath+File.separator+cdHead.getBillNO()+"cd.txt").delete();
				}
				bgWriter.close();
				bgFile.delete();
				throw new  RuntimeException("分运单号："+cdEntryHead.getAssBillNO()+" 已经存在！请不要重复导入");
			}
			createBgTxt(cdEntryHead, bgWriter);
		}
		for (CDEntryHead cdEntryHead : heads) {
			entryHeadService.saveOrUpdate(cdEntryHead);
		}
		if(isImport){
			cdWriter.close();
		}
		bgWriter.close();
	}

	/** 创建报关单内容 
	 * @throws IOException */
	private void createBgTxt(CDEntryHead cdEntryHead,BufferedWriter bgWriter) throws IOException {
		List<CDEntryListVo> entryLists = cdEntryHead.getEntryList();
		bgWriter.append("<ELEMENT             >");
		bgWriter.newLine();
		bgWriter.append("<BGDHEAD             >");
		bgWriter.append(cdEntryHead.toString());
		bgWriter.newLine();
		//当为文件类型时 就不产生这行
		if(1!=cdEntryHead.getEntryType()){
			for (CDEntryListVo cdEntryList : entryLists) {
				bgWriter.append("<BGDLIST             >");
				bgWriter.append(cdEntryList.toString());
				bgWriter.newLine();
			}
		}
		bgWriter.append("</ELEMENT            >");
		bgWriter.newLine();
	}
	/** 创建报关单内容 
	 * @throws IOException */
	private void createCdTxt(CDEntryHead cdEntryHead,BufferedWriter cdWriter) throws IOException {
		cdWriter.append(cdEntryHead.toCDString());
		cdWriter.newLine();
	}

	@Override
	public void createExpTxt(String inPath, String outPath, CDHead cdHead)
			throws Exception {
		
		cdHead = this.readExcel(inPath, cdHead);
		this.createExpTxt(outPath, cdHead);
		
	}


}
