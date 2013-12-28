package com.xgs.zwy.dao.impl;

import org.springframework.stereotype.Repository;

import com.xgs.zwy.dao.CDHeadDao;
import com.xgs.zwy.dao.base.BaseDaoImpl;
import com.xgs.zwy.domain.CDHead;

@Repository("cdHeadDao")
public class CDHeadDaoImpl extends BaseDaoImpl<CDHead, Long>implements CDHeadDao {

}
