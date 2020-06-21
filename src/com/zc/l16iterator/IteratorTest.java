package com.zc.l16iterator;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Item i1 = new Item("Item1" , 10f);
        Item i2 = new Item("Item2" , 20f);
        Item i3 = new Item("Item3" , 30f);
        Menu menu = new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);
        System.out.println("Iterator Menu:" );
        Iterator<Item> it = menu.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("remove last item:" );
        it.remove();
        System.out.println("Iterator Menu:" );

        it = menu.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
