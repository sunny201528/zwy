package com.xgs.zwy.domain;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.xgs.zwy.util.DateUtils;
import com.xgs.zwy.util.NumberUtil;


/**
 * 舱单头信息
 * @author n-194
 *
 */
@Entity
@Table(name="t_CDHead")
public class CDHead  extends BaseDomain{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	/**	总运单号*/
	@Column
	private String billNO;
	@Column
	/**运输工具航次(班)号*/
	private String voyageName;
	/**运输工具名称*/
//	private String voyageNO;
	/**进出口标志*/
	@Column
	private String i_E_Flag;
	@Column
	/**主单件数*/
	private long   totalCount;
	/** 主单重量*/
	@Column
	private double totalWT;
	/**进出口日期*/
	@Column
	private Date i_E_Date;
	/**	起运港(递运港)*/
	@Column
	private String destinationPort;
	/**进出口岸代码*/
	@Column
	private String i_E_Port;
	/**运输方式代码*/
	@Column
	private String trafMode;
	/**导入时间*/
	@Column
	private Date importTime = new Date();
	@Transient
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
	
	
public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
