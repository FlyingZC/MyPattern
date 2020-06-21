package com.zc.l05prototype;

//用于创建和管理原型对象
public class AnimalCreator {
    private Chicken chicken = new Chicken();
    private Sheep sheep;

    /**
     * 恢复对象的方法
     *
     * @param kindOfAnimal
     * @return
     */
    public Animal retrieveAnimal(String kindOfAnimal) {
        if ("Chicken".equals(kindOfAnimal)) {
            return chicken.clone();
        } else if ("Sheep".equals(kindOfAnimal)) {
            return sheep.clone();
        }
        return null;
    }
}
