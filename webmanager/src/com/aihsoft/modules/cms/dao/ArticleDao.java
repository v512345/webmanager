/**
 */
package com.aihsoft.modules.cms.dao;

import com.aihsoft.common.persistence.CrudDao;
import com.aihsoft.common.persistence.annotation.MyBatisDao;
import com.aihsoft.modules.cms.entity.Article;

/**
 * 文章DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface ArticleDao extends CrudDao<Article> {
	public Article get(String id);
	
}
