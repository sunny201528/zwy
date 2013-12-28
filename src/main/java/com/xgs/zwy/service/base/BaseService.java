package com.xgs.zwy.service.base;

import java.io.Serializable;

public interface BaseService<T, PK extends Serializable> {
	/*
	 * 保存或更新PO
	 */
	public void saveOrUpdate(T entity) ;

	/*
	 * 更新PO
	 */
	public void update(T entity)  ;

	/*
	 * 合并PO
	 */
	public void merge(T entity) ; 
	/*
	 * 根据id删除PO
	 */
	public void delete(PK id) ;

	/*
	 * 删除PO
	 */
	public void deleteObject(T entity) ;
	/*
	 * 根据id判断PO是否存在
	 */
	public boolean exists(PK id);
	/*
	 * 根据id加载PO
	 */
	public T load(PK id) ;
	/*
	 * 根据id获取PO
	 */
	public T get(PK id) ;
}
