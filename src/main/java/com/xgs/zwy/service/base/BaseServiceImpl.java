package com.xgs.zwy.service.base;

import java.io.Serializable;
import java.util.List;

import com.xgs.zwy.dao.base.BaseDao;

public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK>{

	protected  BaseDao<T, PK> baseDao;
	
	@Override
	public void save(T entity) {
		baseDao.save(entity);
		
	}
	@Override
	public void saveOrUpdate(T entity) {
		baseDao.saveOrUpdate(entity);
		
	}

	@Override
	public void update(T entity) {
		baseDao.update(entity);		
	}

	@Override
	public void merge(T entity) {
		baseDao.merge(entity);			
	}

	@Override
	public void delete(PK id) {
		baseDao.delete(id);			
	}

	@Override
	public void deleteObject(T entity) {
		baseDao.deleteObject(entity);	
		
	}

	@Override
	public boolean exists(PK id) {
		return baseDao.exists(id);
	}

	@Override
	public T load(PK id) {
		return baseDao.load(id);
	}

	@Override
	public T get(PK id) {
		return baseDao.get(id);
	}
	@Override
	public List<T> list() {
		return baseDao.list();
	}

	public void setBaseDao(BaseDao<T, PK> baseDao) {
		this.baseDao = baseDao;
	}

}
