/**
 * Project Name:zwy
 * File Name:TradeName.java
 * Package Name:com.xgs.zwy.domain
 * Date:2014年5月30日上午12:26:02
 * Copyright (c) 2014, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.xgs.zwy.domain;

/**
 * ClassName:ProductName 品名 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年5月30日 上午12:26:02 <br/>
 * 
 * @author n-194
 * @version
 * @since JDK 1.6
 * @see
 */
public class ProductName {
	/** 中文货物名称 商品名称（B类叫：物品名称） */
	private String gName_cn;
	/** 商品编号（行邮税号） */
	private String codeTS;
	/** 商品规格、型号 */
	private String gModel;
	/** 单价 */
	private double price;

	public String getgName_cn() {
		return gName_cn;
	}

	public void setgName_cn(String gName_cn) {
		this.gName_cn = gName_cn;
	}

	public String getCodeTS() {
		return codeTS;
	}

	public void setCodeTS(String codeTS) {
		this.codeTS = codeTS;
	}

	public String getgModel() {
		return gModel;
	}

	public void setgModel(String gModel) {
		this.gModel = gModel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
