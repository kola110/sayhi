package com.cjlubbs.demo.sayhi.common;

import com.cjlubbs.demo.sayhi.bean.UserInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Nick
 * Date: 2018-04-26
 * Time: 下午4:47
 */
public class CommonUtil {

    public static void sortById(List list, String order) {
        list.sort((Object o1, Object o2) -> {
            UserInfo user1 = (UserInfo) o1;
            UserInfo user2 = (UserInfo) o2;
            boolean b;
            if ("asc".equalsIgnoreCase(order)) {
                b = user1.getId() > user2.getId();
            } else {
                b = user1.getId() < user2.getId();
            }
            if (b) {
                return 1;
            } else if (user1.getId() == user2.getId()) {
                return 0;
            } else {
                return -1;
            }
        });
    }

    public static void sortByName(List list, String order) {
        list.sort((Object o1, Object o2) -> {
            UserInfo user1 = (UserInfo) o1;
            UserInfo user2 = (UserInfo) o2;
            if ("asc".equalsIgnoreCase(order)) {
                return user1.getName().compareTo(user2.getName());
            } else {
                return user2.getName().compareTo(user1.getName());
            }
        });
    }
}
