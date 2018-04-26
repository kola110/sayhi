package com.cjlubbs.demo.sayhi.service;

import com.cjlubbs.demo.sayhi.bean.UserInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:用户接口
 * User: Nick
 * Date: 2018-04-26
 * Time: 下午4:47
 */
public interface UserInfoService {

    long addUserInfo(UserInfo userInfo);

    boolean updateUserInfo(UserInfo userInfo);

    boolean deleteUserInfo(long id);

    List<UserInfo> listUserInfo(String name);

}
