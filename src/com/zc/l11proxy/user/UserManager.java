package com.zc.l11proxy.user;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 实现示例要求的功能
 */
public class UserManager {
    /**
     * 根据部门编号来获取该部门下的所有人员.该方法只查id和name,且集合存储的是代理对象
     *
     * @param depId 部门编号
     * @return 该部门下的所有人员
     */
    public Collection<UserModelApi> getUserListByDepId(String depId) throws Exception {
        Collection<UserModelApi> userList = new ArrayList<UserModelApi>();
        //只需要查询userId和name两个值就可以了
        //这里是创建的代理对象，而不是直接创建UserModel的对象
        Proxy proxy = new Proxy(new UserModel());
        //只是设置userId和name两个值就可以了
        for (UserModel model : DbData.USERS) {
            proxy.setUserId(model.getUserId());
            proxy.setName(model.getName());
            userList.add(proxy);
        }
        return userList;
    }
}
