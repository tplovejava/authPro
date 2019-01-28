package com.tp.soft.controller;

import com.tp.soft.entity.SysUser;
import com.tp.soft.service.SysUserSvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SysUserController {

    @Resource
    private SysUserSvc sysUserSvc;

    @GetMapping("/queryList")
    public List<SysUser> queryList() {
        return sysUserSvc.findAllUser();
    }

    @PostMapping("/findById/{userid}")
    public SysUser findById(@PathVariable("userid") int userid){
        return sysUserSvc.findById(userid);
    }

}
