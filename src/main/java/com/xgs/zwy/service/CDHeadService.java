package com.xgs.zwy.service;

import com.xgs.zwy.domain.CDHead;
import com.xgs.zwy.service.base.BaseService;

public interface CDHeadService extends BaseService<CDHead, Long>{
	
	/**
	 * 通过总运单号查找
	 * @param billNO
	 * @return
	 */
	public CDHead findByBillNO(String billNO);

}
