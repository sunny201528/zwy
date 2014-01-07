/**
 * Project Name:zwy
 * File Name:TradeNameCache.java
 * Package Name:com.xgs.zwy.domain
 * Date:2014年6月3日上午9:44:17
 * Copyright (c) 2014, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.xgs.zwy.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:TradeNameCache 缓存品名信息 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年6月3日 上午9:44:17 <br/>
 * 
 * @author n-194
 * @version
 * @since JDK 1.6
 * @see
 */
public class ProductNameCache {

	private ProductNameCache() {
	}

	private static Map<String, ProductName> TRADENAME_CACHE = new HashMap<String, ProductName>();

	public static void put(ProductName tradeName) {
		TRADENAME_CACHE.put(tradeName.getgName_cn().trim(), tradeName);
	}

	public static int size() {
		return TRADENAME_CACHE.size();
	}

	public static void putAll(List<ProductName> list) {
		for (ProductName tradeName : list) {
			TRADENAME_CACHE.put(tradeName.getgName_cn().trim(), tradeName);
		}
	}

	public static ProductName get(String key) {
		return TRADENAME_CACHE.get(key);
	}
}
