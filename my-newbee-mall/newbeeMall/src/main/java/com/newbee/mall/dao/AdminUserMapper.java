package com.newbee.mall.dao;

import com.newbee.mall.entity.AdminUser;

public interface AdminUserMapper {
    /**
     * 登录方法
     */
    AdminUser login(String userName,String password);

}
