package com.xgs.zwy.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.xgs.zwy.constant.Constants;
import com.xgs.zwy.util.DateUtils;
import com.xgs.zwy.util.NumberUtil;
import com.xgs.zwy.util.StringUtil;
import com.xgs.zwy.vo.CDEntryListVo;

@Entity
@Table(name="t_CDEntryHead")
public class CDEntryHead extends BaseDomain{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	/**分运单号*/
	@Column
	private String assBillNO;
	/** 英文货物名称 商品名称（B类叫：物品名称） */
	@Column
	private String gName_en;
	/**中文货物名称 商品名称（B类叫：物品名称） */
	@Column
	private String gName_cn;
	/** 商品编号（行邮税号） */
	@Column
	private String codeTS;	
	/** 商品规格、型号 */
	@Column
	private String gModel;
	@Column
	/** 数量 */
	private String gQty;
	@Column
	/** 件数 */
	private Integer packNO;	
	@Column
	/** 重量  */
	private Double gGrossWt;
	@Column
	/** 申报总价  */
	private String declTotal;
	@Column
	/** 币制  */
	private Integer currCode;
	/** 发件人  */
	@Column
	private String sendName;
	/** 收件人  */
	@Column
	private String receiveName;
	/** 发件人国别  */
	@Column
	private Integer sendCountry;	
	/** 发件人城市  */
	@Column
	private String sendCity;
	/** 	报关类别  */
	@Column
	private Integer entryType;//
	/** 经营单位编号  */
	@Column
	private String tradeCO;//	
	/** 经营单位名称  */
	private String tradeName;
	/** 舱单头信息  */
	@ManyToOne
	@JoinColumn(name="cdHead_id")
	private CDHead cdHead;
	public String getAssBillNO() {
		return assBillNO;
	}
	public void setAssBillNO(String assBillNO) {
		this.assBillNO = assBillNO;
	}
	public String getgName_cn() {
		return gName_cn;
	}
	public void setgName_cn(String gName_cn) {
		this.gName_cn = gName_cn;
	}
	public String getgName_en() {
		return gName_en;
	}
	public void setgName_en(String gName_en) {
		this.gName_en = gName_en;
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
	public String getgQty() {
		return gQty;
	}
	public void setgQty(String gQty) {
		this.gQty = gQty;
	}
	public Integer getPackNO() {
		return packNO;
	}
	public void setPackNO(Integer packNO) {
		this.packNO = packNO;
	}
	public Double getgGrossWt() {
		return gGrossWt;
	}
	public void setgGrossWt(Double gGrossWt) {
		this.gGrossWt = gGrossWt;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeclTotal() {
		return declTotal;
	}
	public void setDeclTotal(String declTotal) {
		this.declTotal = declTotal;
	}
	public Integer getCurrCode() {
		return currCode;
	}
	public void setCurrCode(Integer currCode) {
		this.currCode = currCode;
	}
	public String getSendName() {
//		
		
		return sendName;
	}
	public void setSendName(String sendName) {
		if(sendName!=null){
			sendName = StringUtil.replacePunctuation(sendName);
			sendName = sendName.length()>50?sendName.substring(0,49):sendName;
		}
		this.sendName = sendName;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		if(receiveName!=null){
			receiveName = StringUtil.replacePunctuation(receiveName);
			receiveName = receiveName.length()>50?receiveName.substring(0,49):receiveName;
		}
		this.receiveName = receiveName;
	}
	public Integer getSendCountry() {
		return sendCountry;
	}
	public void setSendCountry(Integer sendCountry) {
		this.sendCountry = sendCountry;
	}
	public String getSendCity() {
		return sendCity;
	}
	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}
	public Integer getEntryType() {
		return entryType;
	}
	public void setEntryType(Integer entryType) {
		this.entryType = entryType;
	}
	public String getTradeCO() {
		return tradeCO;
	}
	public void setTradeCO(String tradeCO) {
		this.tradeCO = tradeCO;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public CDHead getCdHead() {
		return cdHead;
	}
	public void setCdHead(CDHead cdHead) {
		this.cdHead = cdHead;
	}
	@Override
	public String toString() {
		//2个20131115  3039 ？？
		return "HN||||"+cdHead.getVoyageNO()+"||"+cdHead.getBillNO()+"||"+assBillNO+"||"+cdHead.getI_E_Flag()+"||"+cdHead.getTrafMode()+
				"||"+cdHead.getI_E_Port()+"||"+sendCountry+"||"+cdHead.getVoyageName()+"||"+sendName+"||"+receiveName+
				"||"+sendCountry+"||"+sendCity+"||||||||"+cdGName_cn()+"||"+packNO+"||"+gGrossWt+"||"+NumberUtil.df.format(cdDecl())+"||"+currCode+"||"+DateUtils.SIMPLE_TIME_DF.format(cdHead.getI_E_Date())+"||"+DateUtils.SIMPLE_TIME_DF.format(cdHead.getImportTime())+"||"+
				entryType+"||||||||||||||"+Constants.ENTRY_TYPE.get(entryType+"")+"||"+tradeCO+"||" + tradeName;
	}
	public String toCDString() {
		//2个20131115  3039 ？？
		return assBillNO+"||"+gName_en+"||"+cdGName_cn()+"||"+packNO+"||"+gGrossWt+
				"||"+NumberUtil.df.format(cdDecl())+"||"+currCode+"||"+sendName+"||"+receiveName+
				"||"+sendCountry+"||"+sendCity+"||||"+entryType;
	}
	private String cdGName_cn(){
		return gName_cn.replaceAll("\\|", ",");
	}
	private Double cdDecl(){
		String[] tmp = declTotal.split("\\|");
		Double total = 0d;
		for (String string : tmp) {
			total+= Double.valueOf(string);
		}
		return total;
	}
	public List<CDEntryListVo> getEntryList() {
		List<CDEntryListVo> entryList = new ArrayList<CDEntryListVo>();
		String[] names = null;
		if(this.gName_cn!=null){
			names = gName_cn.split("\\|");
		}
		String[] codes = null;
		if(this.codeTS!=null){
			codes = codeTS.split("\\|");
		}
		String[] declTotals = null;
		if(this.declTotal!=null){
			declTotals = declTotal.split("\\|");
		}
		String[] gModels = null;
		if(this.gModel!=null){
			gModels = gModel.split("\\|");
		}
		if(names==null||codes==null||declTotals==null||gModels==null){
			return entryList;}
		if(names.length!=codes.length||names.length!=declTotals.length||names.length!=gModels.length){
			System.out.println(codeTS);
			System.out.println(gName_cn);
			System.out.println(declTotal);
			throw new RuntimeException("商品编码和货物名称不对应和申报总价对应不上");
		}
		Double[] wt = getWt(declTotals);
		try {
			
		for (int i = 0; i < codes.length; i++) {
			CDEntryListVo entry = new CDEntryListVo();
				BeanUtils.copyProperties(entry, this);
			entry.setCodeTS(codes[i]);
			entry.setgName_cn(names[i]);
			entry.setDeclTotal(Double.valueOf(declTotals[i]));
			entry.setOrder(i+1);
			entry.setEntryHead(this);
			entry.setgGrossWt(wt[i]);
			entry.setgModel(gModels[i]);
			entryList.add(entry);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entryList;
	}

	/**
	 * 
	 * @param one  
	 * @param decl  单个的价格
	 * @param total 总的重量
	 * @param isLast 是否是最后一个报价的
	 * @return
	 */
private Double[] getWt(String[] decl){
	Double[] wt = new Double[decl.length];
	Double totalDecl = cdDecl();
	Double tmp  = gGrossWt;
	for (int i = 0; i < decl.length; i++) {
		Double oneDecl = Double.valueOf(decl[i]);
		if(i==decl.length-1){
			wt[i] =tmp;
		}else{
			wt[i] = new BigDecimal(oneDecl*gGrossWt/totalDecl).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
			tmp = tmp -wt[i];
		}
	}
	return wt;
	
	
	
}
	
}
