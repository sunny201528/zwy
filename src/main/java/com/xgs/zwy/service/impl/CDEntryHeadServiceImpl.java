package com.xgs.zwy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xgs.zwy.dao.CDEntryHeadDao;
import com.xgs.zwy.domain.CDEntryHead;
import com.xgs.zwy.service.CDEntryHeadService;
import com.xgs.zwy.service.base.BaseServiceImpl;

public class CDEntryHeadServiceImpl extends BaseServiceImpl<CDEntryHead, Long> implements CDEntryHeadService{
	@Autowired
	private CDEntryHeadDao cdEntryHeadDao;
	
	@Override
	public CDEntryHead findByAssBillNO(String assBillNO) {
		return cdEntryHeadDao.uniqueResult("assBillNO", assBillNO);
	}
	
	
	public void setCdEntryHeadDao(CDEntryHeadDao cdEntryHeadDao) {
		super.baseDao = cdEntryHeadDao;
		this.cdEntryHeadDao = cdEntryHeadDao;
	}



}
