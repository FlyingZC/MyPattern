package com.zc.l11proxy.user;

/**
 * 代理对象,代理用户数据对象
 */
public class Proxy implements UserModelApi {
    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject = null;
    /**
     * 标示是否已经重新装载过数据了
     */
    private boolean loaded = false;

    /**
     * 构造方法，传入被代理的具体的目标对象
     *
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    public String getUserId() {
        return realSubject.getUserId();
    }

    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    public String getName() {
        return realSubject.getName();
    }

    public void setName(String name) {
        realSubject.setName(name);
    }

    /**
     * 在代理类里控制,需要的时候再去加载机构信息
     */
    public String getDepId() {
        // 需要判断是否已经装载过了
        if (!this.loaded) {
            // 若没有装载deptId属性,重新查询.从数据库中重新装载
            reload();
            // 设置重新装载的标志为true
            this.loaded = true;
        }
        return realSubject.getDepId();
    }

    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    public String getSex() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    /**
     * 重新查询数据库以获取完整的用户数据
     */
    private void reload() {
        System.out.println("重新查询数据库获取完整的用户数据，userId==" + realSubject.getUserId());
        //只需要重新获取除了userId和name外的数据
        for (UserModel model : DbData.USERS) {
            realSubject.setDepId(model.getDepId());
            realSubject.setSex(model.getSex());
        }
    }

    public String toString() {
        return "userId=" + getUserId() + ",name=" + getName() + ",depId=" + getDepId() + ",sex=" + getSex() + "\n";
    }


}
