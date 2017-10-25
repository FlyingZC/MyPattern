package com.zc.l18memento;

public class MementoTest
{
    public static void main(String[] args)
    {
        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.saveToMemento());
        originator.setState("State3");
        caretaker.addMemento(originator.saveToMemento());
        originator.restoreFromMemento(caretaker.getMemento(1));
    }
}
