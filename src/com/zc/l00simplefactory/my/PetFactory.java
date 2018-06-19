package com.zc.l00simplefactory.my;

import com.zc.l00simplefactory.Dog;
import com.zc.l00simplefactory.Pet;

public class PetFactory
{
    public static Pet getInstance(Class<? extends Pet> clazz) throws Exception
    {
        return clazz.newInstance();
    }
    
    public static void main(String[] args) throws Exception
    {
        Dog dog = (Dog) PetFactory.getInstance(Dog.class);
        System.out.println(dog);
    }
}
