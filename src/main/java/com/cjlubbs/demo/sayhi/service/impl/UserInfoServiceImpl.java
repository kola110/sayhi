package com.cjlubbs.demo.sayhi.service.impl;

import com.cjlubbs.demo.sayhi.bean.UserInfo;
import com.cjlubbs.demo.sayhi.service.UserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:用户操作类
 * User: Nick
 * Date: 2018-04-26
 * Time: 下午4:47
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private static List<UserInfo> userInfos = new ArrayList<>();

    public UserInfoServiceImpl() {
        if (userInfos.isEmpty()) {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(1);
            userInfo.setLoginname("andy");
            userInfo.setPassword("");
            userInfo.setName("Andy");
            userInfos.add(userInfo);
            userInfo = new UserInfo();
            userInfo.setId(2);
            userInfo.setLoginname("carl");
            userInfo.setPassword("");
            userInfo.setName("Carl");
            userInfos.add(userInfo);
            userInfo = new UserInfo();
            userInfo.setId(3);
            userInfo.setLoginname("bruce");
            userInfo.setPassword("");
            userInfo.setName("Bruce");
            userInfos.add(userInfo);
            userInfo = new UserInfo();
            userInfo.setId(4);
            userInfo.setLoginname("dolly");
            userInfo.setPassword("");
            userInfo.setName("Dolly");
            userInfos.add(userInfo);
        }
    }

    @Override
    public long addUserInfo(UserInfo userInfo) {
        long id = userInfos.size() + 1;
        userInfo.setId(id);
        userInfos.add(userInfo);
        return id;
    }

    @Override
    public boolean updateUserInfo(UserInfo userInfo) {
        for (UserInfo u :userInfos) {
            if (u.getId() == userInfo.getId()){
                BeanUtils.copyProperties(userInfo,u);
            }
        }
        return false;
    }

    @Override
    public boolean deleteUserInfo(long id) {
        ListIterator iterator =  userInfos.listIterator();
        while(iterator.hasNext()){
            UserInfo u = (UserInfo) iterator.next();
            if(u.getId() == id){
                iterator.remove();
            }
        }
        return true;
    }

    @Override
    public List<UserInfo> listUserInfo(String name) {
        if(StringUtils.isEmpty(name)){
            return userInfos;
        }
        List<UserInfo> results = new ArrayList<>();
        for (UserInfo u : userInfos) {
            if(u.getName().contains(name)){
                results.add(u);
            }
        }
        return results;
    }
}
