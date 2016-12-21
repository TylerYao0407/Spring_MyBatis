package com.tyler.service;

import com.tyler.model.User;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by tyler on 2016/12/21.
 */
public class UserServiceImpl implements UserService {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    public User selectByPrimaryKey(Integer id) {
        return sqlSessionTemplate.selectOne("com.tyler.dao.UserMapper.selectByPrimaryKey",id);
    }
}
