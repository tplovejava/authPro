package com.tp.soft.service.impl;

import com.tp.soft.entity.SysUser;
import com.tp.soft.mapper.SysUserMapper;
import com.tp.soft.redis.service.RedisService;
import com.tp.soft.service.SysUserSvc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserSvcImpl implements SysUserSvc {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private RedisService redisService;

    @Override
    public List<SysUser> findAllUser() {
        redisService.set("zs", "1234");
        return sysUserMapper.findAll();
    }

    @Override
    public SysUser findById(int userid) {
        return sysUserMapper.findById(userid);
    }

}
