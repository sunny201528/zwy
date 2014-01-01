package com.xgs.zwy.service.impl;

import com.xgs.zwy.dao.CDHeadDao;
import com.xgs.zwy.dao.impl.CDHeadDaoImpl;
import com.xgs.zwy.domain.CDHead;
import com.xgs.zwy.service.CDHeadService;
import com.xgs.zwy.service.base.BaseServiceImpl;
public class CDHeadServiceImpl extends BaseServiceImpl<CDHead, Long> implements CDHeadService{
	private CDHeadDao cdHeadDao = new CDHeadDaoImpl();
	{
		super.baseDao=cdHeadDao;
	}
	@Override
	public CDHead findByBillNO(String billNO) {
		return cdHeadDao.uniqueResult("billNO", billNO);
	}

	public void setCdHeadDao(CDHeadDao cdHeadDao) {
		super.baseDao = cdHeadDao;
		this.cdHeadDao = cdHeadDao;
	}
	
	
}
