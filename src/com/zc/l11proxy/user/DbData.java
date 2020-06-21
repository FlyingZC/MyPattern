package com.zc.l11proxy.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author flyingzc
 * 模拟数据库查询回来的数据
 */
public class DbData {
    public static final List<UserModel> USERS = new ArrayList<UserModel>();
    private static final Map<String, Object> DATA = new HashMap<String, Object>();

    static {
        for (int i = 0; i < 10; i++) {
            UserModel model = new UserModel();
            model.setDepId("1000" );
            model.setName("张" + i);
            model.setSex("女" );
            model.setUserId("" + i);
            USERS.add(model);
        }

    }
}
