package com.lh.models.sys.dao;

import com.lh.models.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    SysUser getById(Long id);

}