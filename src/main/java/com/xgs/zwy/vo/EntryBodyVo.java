package com.xgs.zwy.vo;

public class EntryBodyVo {
	private String opType;// 　　操作类型
	// 缺失属性
	private String gNo;
	// 缺失属性结束

	private String codeTS;// 商品编号（行邮税号）
	private String gName;// 商品名称（B类叫：物品名称）
	private String gModel;// 商品规格、型号
	private String originCountry;// 产销国
	private String tradeCurr;// 成交币制
	// 缺失属性
	private String exchangeRate;
	// 缺失属性结束

	private String tradetotal;// 成交总价
	// 缺失属性
	private String declPrice;
	// 缺失属性结束

	private String declTotal;// 申报总价
	private String useTo;// 用途
	private String dutyMode;// 征减免税方式

	private String gQty;// 申报数量
	private String gUnit;// 申报计量单位
	private String qty1;// 第一（法定）数量
	private String unit1;// 第一(法定)计量单位
	private String qty2;// 第二数量
	private String unit2;// 第二计量单位
	// 缺失属性
	private String classMark;
	// 缺失属性结束

	private String gGrossWt;// 商品毛重

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getgNo() {
		return gNo;
	}

	public void setgNo(String gNo) {
		this.gNo = gNo;
	}

	public String getCodeTS() {
		return codeTS;
	}

	public void setCodeTS(String codeTS) {
		this.codeTS = codeTS;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgModel() {
		return gModel;
	}

	public void setgModel(String gModel) {
		this.gModel = gModel;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getTradeCurr() {
		return tradeCurr;
	}

	public void setTradeCurr(String tradeCurr) {
		this.tradeCurr = tradeCurr;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getTradetotal() {
		return tradetotal;
	}

	public void setTradetotal(String tradetotal) {
		this.tradetotal = tradetotal;
	}

	public String getDeclPrice() {
		return declPrice;
	}

	public void setDeclPrice(String declPrice) {
		this.declPrice = declPrice;
	}

	public String getDeclTotal() {
		return declTotal;
	}

	public void setDeclTotal(String declTotal) {
		this.declTotal = declTotal;
	}

	public String getUseTo() {
		return useTo;
	}

	public void setUseTo(String useTo) {
		this.useTo = useTo;
	}

	public String getDutyMode() {
		return dutyMode;
	}

	public void setDutyMode(String dutyMode) {
		this.dutyMode = dutyMode;
	}

	public String getgQty() {
		return gQty;
	}

	public void setgQty(String gQty) {
		this.gQty = gQty;
	}

	public String getgUnit() {
		return gUnit;
	}

	public void setgUnit(String gUnit) {
		this.gUnit = gUnit;
	}

	public String getQty1() {
		return qty1;
	}

	public void setQty1(String qty1) {
		this.qty1 = qty1;
	}

	public String getUnit1() {
		return unit1;
	}

	public void setUnit1(String unit1) {
		this.unit1 = unit1;
	}

	public String getQty2() {
		return qty2;
	}

	public void setQty2(String qty2) {
		this.qty2 = qty2;
	}

	public String getUnit2() {
		return unit2;
	}

	public void setUnit2(String unit2) {
		this.unit2 = unit2;
	}

	public String getClassMark() {
		return classMark;
	}

	public void setClassMark(String classMark) {
		this.classMark = classMark;
	}

	public String getgGrossWt() {
		return gGrossWt;
	}

	public void setgGrossWt(String gGrossWt) {
		this.gGrossWt = gGrossWt;
	}

	/**
	 * GNo ExchangeRate DeclPrice ClassMark
	 */
}
