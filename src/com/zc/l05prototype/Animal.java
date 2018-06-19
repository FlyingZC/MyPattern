package com.zc.l05prototype;

import java.util.Arrays;

// Animal原型类,定义clone方法来实现对  两个子类型  或  具体原型类  的克隆操作
// 必须实现Cloneable接口,否则报CloneNotSupportedException
public class Animal implements Cloneable
{

    private Integer age;

    private String name;

    private String[] hobbies;

    private House house;

    private String description;

    @Override
    public Animal clone()
    {
        Animal clonedAnimal = null;
        try
        {
            // 默认clone()进行的是浅拷贝
            clonedAnimal = (Animal) super.clone();
            /*clonedAnimal.setDescription(description);
            clonedAnimal.setNumberOfLegs(numberOfLegs);
            clonedAnimal.setName(name);
            clonedAnimal.setHobbies(hobbies);*/
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clonedAnimal;
    }

    public Animal()
    {
        super();
    }

    public Animal(String name, Integer numberOfLegs, String[] hobbies)
    {
        super();
        this.age = numberOfLegs;
        this.name = name;
        this.hobbies = hobbies;
    }

    public Integer getNumberOfLegs()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setNumberOfLegs(Integer numberOfLegs)
    {
        this.age = numberOfLegs;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String[] getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(String[] hobbies)
    {
        this.hobbies = hobbies;
    }

    public House getHouse()
    {
        return house;
    }

    public void setHouse(House house)
    {
        this.house = house;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Animal [age=" + age + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies)
                + ", house=" + house + "]";
    }

}
