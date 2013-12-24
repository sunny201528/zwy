package com.xgs.zwy.domain;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.xgs.zwy.util.DateUtils;
import com.xgs.zwy.util.NumberUtil;


/**
 * 舱单头信息
 * @author n-194
 *
 */
public class CDHead {
	/**	总运单号*/
	private String billNO;
	/**运输工具航次(班)号*/
	private String voyageName;
	/**运输工具名称*/
//	private String voyageNO;
	/**进出口标志*/
	private String i_E_Flag;
	/**主单件数*/
	private long   totalCount;
	/** 主单重量*/
	private double totalWT;
	/**进出口日期*/
	private Date i_E_Date;
	/**	起运港(递运港)*/
	private String destinationPort;
	/**进出口岸代码*/
	private String i_E_Port;
	/**运输方式代码*/
	private String trafMode;
	/**导入时间*/
	private Date importTime = new Date();
	private List<CDEntryHead> entryHead;
	public String getBillNO() {
		return billNO;
	}
	public void setBillNO(String billNO) {
		this.billNO = billNO;
	}
	public String getI_E_Flag() {
		return i_E_Flag;
	}
	public void setI_E_Flag(String i_E_Flag) {
		this.i_E_Flag = i_E_Flag;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public double getTotalWT() {
		return totalWT;
	}
	public void setTotalWT(double totalWT) {
		this.totalWT = totalWT;
	}
	public Date getI_E_Date() {
		return i_E_Date;
	}
	public void setI_E_Date(Object i_E_Date) {
		if(i_E_Date instanceof String){
			try {
				this.i_E_Date = DateUtils.SIMPLE_TIME_DF.parse((String) i_E_Date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		else if(i_E_Date instanceof Date){ 
			
			this.i_E_Date = (Date) i_E_Date;
		}
	}
	public String getDestinationPort() {
		return destinationPort;
	}
	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort==null?"":destinationPort;
	}
	public String getI_E_Port() {
		return i_E_Port;
	}
	public void setI_E_Port(String i_E_Port) {
		this.i_E_Port = i_E_Port;
	}
	public String getTrafMode() {
		return trafMode;
	}
	public void setTrafMode(String trafMode) {
		this.trafMode = trafMode;
	}
	public Date getImportTime() {
		return importTime;
	}
	public void setImportTime(Date importTime) {
		this.importTime = importTime;
	}
	public List<CDEntryHead> getEntryHead() {
		return entryHead;
	}
	public void setEntryHead(List<CDEntryHead> entryHead) {
		this.entryHead = entryHead;
	}
	
	
public String getVoyageName() {
		return voyageName;
	}
public void setVoyageName(String voyageName) {
		this.voyageName = voyageName;
	}
public String getVoyageNO(){
		return voyageName+DateUtils.SIMPLE_TIME_DF.format(i_E_Date);
		
	}
	public String toCDString() {
		return billNO+"||"+getVoyageNO()+"||"+i_E_Flag+"||||||"+totalWT+
				"||"+NumberUtil.df.format(totalCount)+"||"+entryHead.size()+"||"+trafMode+"||"+DateUtils.SIMPLE_TIME_DF.format(i_E_Date)+"||"+i_E_Port+
				"||"+destinationPort;
	}
	
}