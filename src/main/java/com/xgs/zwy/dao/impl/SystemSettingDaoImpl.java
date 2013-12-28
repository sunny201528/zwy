package com.xgs.zwy.dao.impl;

import org.springframework.stereotype.Repository;

import com.xgs.zwy.dao.SystemSettingDao;
import com.xgs.zwy.dao.base.BaseDaoImpl;
import com.xgs.zwy.domain.SystemSetting;

@Repository("systemSettingDao")
public class SystemSettingDaoImpl  extends BaseDaoImpl<SystemSetting, Integer>implements SystemSettingDao {

}
