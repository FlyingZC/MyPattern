package com.zc.l16iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//菜单 ,包含Item类型的条目列表.addItem()增加条目.createIterator()返回一个条目迭代器
public class Menu {
	List<Item> menuItems;
	public Menu(){
		menuItems=new ArrayList<Item>();
	}
	public void addItem(Item item){
		menuItems.add(item);
	}
	public Iterator<Item> createIterator(){
		return new MenuIterator(this);
	}
	
	public List<Item> getMenuItems(){
		return menuItems;
	}
}
