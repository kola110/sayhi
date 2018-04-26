package com.cjlubbs.demo.sayhi.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:用户实体
 * User: Nick
 * Date: 2018-04-26
 * Time: 下午4:47
 */
public class UserInfo {
    private long id;
    private String loginname;
    private String password; // 加密
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}