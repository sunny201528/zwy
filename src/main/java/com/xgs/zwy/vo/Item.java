package com.xgs.zwy.vo;
public class Item<T,V> {
	private T key;
	
	private V value;
	
	public Item(T key, V value){
		this.key = key;
		this.value = value;
	}


	public void setKey(T key) {
		this.key = key;
	}


	public T getKey() {
		return key;
	}


	public void setValue(V value) {
		this.value = value;
	}


	public V getValue() {
		return value;
	}
	
	public String toString(){
		return value.toString();
	}
}