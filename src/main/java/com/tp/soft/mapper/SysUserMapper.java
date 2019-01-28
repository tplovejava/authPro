package com.tp.soft.mapper;

import com.tp.soft.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface SysUserMapper {

    public List<SysUser> findAll() throws DataAccessException;

    public SysUser findById(int userid) throws DataAccessException;
}
