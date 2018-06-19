package com.zc.l16iterator;

import java.util.Iterator;
import java.util.List;

// 迭代器 继承自java.util.Iterator
public class MenuIterator implements Iterator<Item>
{
    private List<Item> menuItems;

    int currentIndex = 0;

    public MenuIterator(Menu menu)
    {
        menuItems = menu.getMenuItems();
    }

    @Override
    public boolean hasNext()
    {
        if (currentIndex >= menuItems.size())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Item first()
    {
        return menuItems.get(0);
    }

    public Item currentItem()
    {
        return menuItems.get(currentIndex);
    }

    @Override
    public Item next()
    {
        System.out.println(currentIndex);
        return menuItems.get(currentIndex++);// next方法是遍历当前元素,再将指针下移一位
    }

    @Override
    public void remove()
    {
        menuItems.remove(--currentIndex);
    }

}
