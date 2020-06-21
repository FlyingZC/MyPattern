package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 被访问者 基类
 */
public abstract class CustomerBase {
    private String name;

    private Integer age;

    private String job;

    /**
     * 接受访问者访问的方法
     *
     * @param visitor
     */
    protected abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
