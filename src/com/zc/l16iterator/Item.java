package com.zc.l16iterator;
//菜单上的条目:包含名字和价格
public class Item {
	String itemName;
	float itemPrice;
	public Item(String itemName,float itemPrice){
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}
	@Override
	public String toString() {
		return itemName+":"+itemPrice;
	}
}
