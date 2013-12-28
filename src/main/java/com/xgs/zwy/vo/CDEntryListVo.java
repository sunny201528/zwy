package com.xgs.zwy.vo;

import com.xgs.zwy.domain.CDEntryHead;
import com.xgs.zwy.domain.CDHead;
import com.xgs.zwy.util.NumberUtil;
public class CDEntryListVo {
	/**序号*/
	private int order;
	/** 商品编号（行邮税号） */
	private String codeTS;	
	/**中文货物名称 商品名称（B类叫：物品名称） */
	private String gName_cn;
	/** 商品规格型号 */
	private String gModel;
	/** 重量  */
	private Double gGrossWt;	
	/** 申报价  */
	private Double declTotal;

	/** 数量 */
	private String gQty;
	/** 件数 */
	private String packNO;
	private CDEntryHead entryHead;
	
	public String getgModel() {
		return gModel;
	}
	public void setgModel(String gModel) {
		this.gModel = gModel;
	}
	public String getCodeTS() {
		return codeTS;
	}
	public void setCodeTS(String codeTS) {
		this.codeTS = codeTS;
	}
	public String getgName_cn() {
		return gName_cn;
	}
	public void setgName_cn(String gName_cn) {
		this.gName_cn = gName_cn;
	}
	public Double getgGrossWt() {
		return gGrossWt;
	}
	public void setgGrossWt(Double gGrossWt) {
		this.gGrossWt = gGrossWt;
	}
	public Double getDeclTotal() {
		return declTotal;
	}
	public void setDeclTotal(Double declTotal) {
		this.declTotal = declTotal;
	}
	public String getgQty() {
		return gQty;
	}
	public void setgQty(String gQty) {
		this.gQty = gQty;
	}
	public String getPackNO() {
		return packNO;
	}
	public void setPackNO(String packNO) {
		this.packNO = packNO;
	}

	public CDEntryHead getEntryHead() {
		return entryHead;
	}
	public void setEntryHead(CDEntryHead entryHead) {
		this.entryHead = entryHead;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	@Override
	public String toString() {
		CDHead cdHead = entryHead.getCdHead();
		//packNO 位置不确定   125不确定   1不确定
		return "LN||"+cdHead.getBillNO()+"||||"+entryHead.getAssBillNO()+"||"+order+"||"+this.gName_cn+"||"+gModel+"||"+
		packNO +"||125||"+NumberUtil.df.format(gGrossWt)+"||"+NumberUtil.df.format(declTotal)+"||"+entryHead.getCurrCode()+"||1||||"+NumberUtil.df.format(declTotal)+"||"+codeTS+"||"+entryHead.getSendCountry(); 
	
	}	
	
	
	
}
