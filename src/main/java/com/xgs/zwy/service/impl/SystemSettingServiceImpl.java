package com.xgs.zwy.service.impl;

import com.xgs.zwy.dao.impl.SystemSettingDaoImpl;
import com.xgs.zwy.domain.SystemSetting;
import com.xgs.zwy.service.SystemSettingService;
import com.xgs.zwy.service.base.BaseServiceImpl;
public class SystemSettingServiceImpl extends BaseServiceImpl<SystemSetting, Integer> implements SystemSettingService{
	{
		super.baseDao=new SystemSettingDaoImpl() ;
	}
}
