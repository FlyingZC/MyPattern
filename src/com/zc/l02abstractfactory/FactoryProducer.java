package com.zc.l02abstractfactory;

//创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取不同的工厂类,然后再具体由这些工厂类产生具体的类。
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}