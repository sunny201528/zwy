package com.xgs.zwy.service;

import com.xgs.zwy.domain.CDHead;



/**
 * xml报文的父类
 * @author n-194
 *
 */
public interface  ExpTxtService {

	public CDHead readExcel(String inPath,CDHead cdHead) throws Exception;
	public void createExpTxt( String outPath,CDHead cdHead) throws Exception;
	
}
