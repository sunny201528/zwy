package com.xgs.zwy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xgs.zwy.dao.base.BaseDao;
import com.xgs.zwy.domain.SystemSetting;
import com.xgs.zwy.service.SystemSettingService;
import com.xgs.zwy.service.base.BaseServiceImpl;

public class SystemSettingServiceImpl extends BaseServiceImpl<SystemSetting, Integer> implements SystemSettingService{
	@Override
	@Autowired
	@Qualifier("systemSettingDao")
	public void setBaseDao(BaseDao<SystemSetting, Integer> baseDao) {
		super.baseDao = baseDao;
		this.baseDao = baseDao;
	}
}
