/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.aihsoft.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.aihsoft.common.persistence.CrudDao;
import com.aihsoft.common.persistence.DataEntity;

/**
 * Service基类
 * @author ThinkGem
 * @version 2014-05-16
 * 
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService {
	
	/**
	 * 泛型，那个service继承了此类，指定类型，然后这里的实际类型就是指定的service
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {  //通过返回T泛型，得到具体的Object对象；T这个对象继承DataEntity
		return dao.get(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	

	
	/**
	 * 删除数据
	 * @param entity
	 */
	public void delete(T entity) {
		dao.delete(entity);
	}

}
