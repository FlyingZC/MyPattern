package com.zc.l05prototype.deep;

import java.util.Arrays;

// Animal原型类,定义clone方法来实现对  两个子类型  或  具体原型类  的克隆操作
// 必须实现Cloneable接口,否则报CloneNotSupportedException
public class Animal implements Cloneable {

    private Integer age;

    private String name;

    private String[] hobbies;

    private House house;

    private String description;

    public Animal() {
        super();
    }

    public Animal(String name, Integer numberOfLegs, String[] hobbies) {
        super();
        this.age = numberOfLegs;
        this.name = name;
        this.hobbies = hobbies;
    }

    @Override
    public Animal clone() {
        Animal clonedAnimal = null;
        try {
            // 默认clone()进行的是浅拷贝,只有clonedAnimal这个引用指向的和animal不同.其内部属性 指向的引用都相同
            clonedAnimal = (Animal) super.clone();
            // 深拷贝就多了下面这一行代码.
            // super.clone(),java会开辟一块内存空间,把实例的值原样拷贝过去.对基本类型没问题,引用类型是把对应的内存地址拷贝过去了
            clonedAnimal.setName(new String(name));
            clonedAnimal.setAge(new Integer(age));
            String[] h = new String[hobbies.length];
            for (int i = 0; i < hobbies.length; i++) {
                h[i] = hobbies[i];
            }
            clonedAnimal.setHobbies(h);
            // 即克隆后的实例对象的house属性值 和原型对象的house指向同一块内存空间.
            // 若要正确的深度拷贝,则必须手动对每个引用类型的属性进行克隆,并重新设置,覆盖掉super.clone()所拷贝的值
            clonedAnimal.setHouse((House) house.clone());
        } catch (CloneNotSupportedException e) {

        }
        return clonedAnimal;
    }

    public Integer getNumberOfLegs() {
        return age;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.age = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + ", house=" + house
                + "]";
    }

}
