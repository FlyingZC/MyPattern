package com.zc.l18memento;

public class MementoTest {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1" );
        originator.setState("State2" );
        caretaker.addMemento(originator.saveToMemento());// 将原发器的状态2 保存到备忘录 并保存到备忘录管理者
        originator.setState("State3" );
        caretaker.addMemento(originator.saveToMemento());
        originator.restoreFromMemento(caretaker.getMemento(0));
    }
}
