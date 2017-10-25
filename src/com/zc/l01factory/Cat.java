package com.zc.l01factory;

public class Cat implements Pet{
    private String name;
    private Integer age;
    
	public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
	public String petSound() {
		return "Cat miaomiao...";
	}

    @Override
    public String toString()
    {
        return "Cat []";
    }
	
}
