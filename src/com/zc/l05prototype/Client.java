package com.zc.l05prototype;

public class Client {
    public static void main(String[] args) {
        AnimalCreator creator = new AnimalCreator();
        String name = "老虎";
        String[] hobbies = new String[]{"跑" , "跳"};

        Animal animal = new Animal(name, 4000, hobbies);
        House house = new House("爱心小屋" , 100, new String[]{"100m" , "110m" , "120m" , "130m"});
        animal.setHouse(house);
        System.out.println("原始类: " + animal);

        Animal copyAnimal = animal.clone();
        System.out.println("克隆类: " + copyAnimal);
        System.out.println("原始类 和 克隆类是否相等: " + (animal == copyAnimal));// false
        //浅拷贝
        System.out.println("name属性是否相等: " + (animal.getName() == copyAnimal.getName()));// true
        System.out.println("age属性是否相等: " + (animal.getAge() == copyAnimal.getAge()));// true
        System.out.println("hobbies属性是否相等: " + (animal.getHobbies() == copyAnimal.getHobbies()));// true
        System.out.println("house属性是否相等: " + (animal.getHouse() == copyAnimal.getHouse()));// true
        // =====================================
        // 修改原始对象属性 会 影响到 浅拷贝的对象中的相应属性
        System.out.println("================ 2.修改属性值,两个houseName都会发生改变 ===================" );
        // 以下这三种修改,对 animal和animalCopy里的属性都没有影响. 因为它只是修改了原来属性引用的指向. 
        name = "老虎2";
        hobbies[0] = "唱";
        // !!!由于是浅拷贝,所以animal.getHouse() 和 animalCopy.getHouse() 的引用 指向同一个house对象.修改一个,另一个也会发生改变 
        animal.getHouse().setHouseName("这是只修改后的houseName" );
        System.out.println("原始类: " + animal);
        System.out.println("克隆类: " + copyAnimal);
        System.out.println("原始类 和 克隆类是否相等: " + (animal == copyAnimal));// false
        System.out.println("name属性是否相等: " + (animal.getName() == copyAnimal.getName()));// true
        System.out.println("age属性是否相等: " + (animal.getAge() == copyAnimal.getAge()));// true
        System.out.println("hobbies属性是否相等: " + (animal.getHobbies() == copyAnimal.getHobbies()));// true
        System.out.println("house属性是否相等: " + (animal.getHouse() == copyAnimal.getHouse()));// true
        // =====================================
        System.out.println("================ 3.改变引用 ===================" );
        animal.setName("老虎3" );
        animal.setHobbies(new String[]{"走3" , "游3"});
        animal.setHouse(new House("修改小屋3" , 300, new String[]{"300s" , "310s" , "320s" , "330s"}));
        house.setHouseName("这是只修改后的houseName3" );
        System.out.println("原始类: " + animal);
        System.out.println("克隆类: " + copyAnimal);
        System.out.println("原始类 和 克隆类是否相等: " + (animal == copyAnimal));// false
        System.out.println("name属性是否相等: " + (animal.getName() == copyAnimal.getName()));// false
        System.out.println("age属性是否相等: " + (animal.getAge() == copyAnimal.getAge()));// true
        System.out.println("hobbies属性是否相等: " + (animal.getHobbies() == copyAnimal.getHobbies()));// false
        System.out.println("house属性是否相等: " + (animal.getHouse() == copyAnimal.getHouse()));// false
    }
}
