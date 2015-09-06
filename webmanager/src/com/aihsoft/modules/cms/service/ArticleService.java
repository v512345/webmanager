/**
 */
package com.aihsoft.modules.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aihsoft.common.service.CrudService;
import com.aihsoft.modules.cms.dao.ArticleDao;
import com.aihsoft.modules.cms.entity.Article;

/**
 * 文章Service
 */
@Service
@Transactional(readOnly = true)  //这个是事物；这个类启动事物
public class ArticleService extends CrudService<ArticleDao, Article> {
	@Autowired
	private ArticleDao articleDao;
	@Transactional(readOnly = false)
	public Article getaArticle(String id){
		return articleDao.get(id);
	}
}
