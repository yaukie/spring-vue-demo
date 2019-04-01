package org.yaukie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.yaukie.model.User;
import org.yaukie.sys.dao.BaseDao;

@Mapper
public interface UserDao extends  BaseDao<User>{
    int insert(User record);

    int insertSelective(User record);
    
    User login(User user);
}