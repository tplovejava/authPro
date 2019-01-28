package com.tp.soft.service;

import com.tp.soft.entity.SysUser;

import java.util.List;

public interface SysUserSvc {
    public List<SysUser> findAllUser();

    public SysUser findById(int userid);
}
