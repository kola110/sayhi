package com.cjlubbs.demo.sayhi.controller;

import com.cjlubbs.demo.sayhi.bean.UserInfo;
import com.cjlubbs.demo.sayhi.common.CommonUtil;
import com.cjlubbs.demo.sayhi.service.UserInfoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:用户控制类
 * User: Nick
 * Date: 2018-04-26
 * Time: 下午4:47
 */
@RestController
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("welcome");
    }

    @RequestMapping(value = "/list")
    public List<UserInfo> list(HttpServletRequest request, Model model) {
        String queryStr = request.getParameter("queryStr");

        List<UserInfo> list = userInfoService.listUserInfo(queryStr);
        String type = request.getParameter("sort");
        String order = request.getParameter("order");
        if ("id".equalsIgnoreCase(type)) {
            CommonUtil.sortById(list, order);
        } else if ("name".equalsIgnoreCase(type)) {
            CommonUtil.sortByName(list, order);
        }
        return list;
    }

    @RequestMapping(value = "/add")
    public void add(UserInfo userInfo) {
        userInfoService.addUserInfo(userInfo);
    }

    @RequestMapping(value = "/update")
    public void update(UserInfo userInfo) {
        userInfoService.updateUserInfo(userInfo);
    }

    @RequestMapping(value = "/delete")
    public void delete(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        userInfoService.deleteUserInfo(Long.parseLong(id));
    }


    @RequestMapping("/404")
    public String error() {
        return "error";
    }
}

