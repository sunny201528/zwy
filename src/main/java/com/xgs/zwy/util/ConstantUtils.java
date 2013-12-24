package com.xgs.zwy.util;

import java.util.Map;

import com.xgs.zwy.vo.Item;


public class ConstantUtils {
/**
 * 
 * @param map
 * @param isSelect  是否添加请选择框
 * @return
 */
	public static <K ,V> Item<K, V>[] map2Array(Map<K, V> map,boolean isSelect){
		int size = map.size();
		int i = 0;
		Item<K,V>[] items = null;
		if (isSelect) {
			items = new Item[size+1];
			items[0] = new Item<K,V>(null, (V) "请选择");
			i++;
		}else{
			items = new Item[size];
		}
		for ( Map.Entry<K, V> entry : map.entrySet()) {
			items[i] = new Item<K,V>(entry.getKey(), entry.getValue());
			i++;
		}
		return items;
		
	}
}
