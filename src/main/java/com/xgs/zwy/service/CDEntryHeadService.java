package com.xgs.zwy.service;

import com.xgs.zwy.domain.CDEntryHead;
import com.xgs.zwy.service.base.BaseService;

public interface CDEntryHeadService extends BaseService<CDEntryHead, Long>{
	/**
	 * 通过分运单号查找
	 * @param billNO
	 * @return
	 */
	public CDEntryHead findByAssBillNO(String assBillNO);
}
