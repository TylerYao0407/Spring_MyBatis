package com.tyler.service;

import com.tyler.model.User;

/**
 * Created by tyler on 2016/12/21.
 */
public interface UserService {
    User selectByPrimaryKey(Integer id);
}
