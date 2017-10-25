package com.zc.l22templatemethod;

public class TestTemplateMethod
{
    public static void main(String[] args)
    {
        Lunch meal1=new McDonaldMeal();
        meal1.preprareLunch();
        Lunch meal2=new KFCMeal();
        meal2.preprareLunch();
    }
}
