package com.zc.z01strategy;

//游戏角色超类
public abstract class Role {
    protected Attack attack;
    protected Display display;
    protected Name name;

    public Role setAttack(Attack attack) {
        this.attack = attack;
        return this;//return this支持连缀
    }

    public Role setDisplay(Display display) {
        this.display = display;
        return this;
    }

    public Role setName(Name name) {
        this.name = name;
        return this;
    }

    protected void attack() {
        attack.attack();
    }

    protected void display() {
        display.display();
    }

    protected void define() {
        name.define();
    }
}
