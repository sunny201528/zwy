package com.xgs.zwy.vo;

public class EntryHeadVo {
	private String opType;//	　　操作类型
	private String preEntryId;//预录入号码
	private String entryId	;//　　海关编号
	private String i_E_Flag;//进出口标志
	private String i_E_Port;//进出口岸代码
	private String i_E_Date;//进出口日期
	private String d_Date;//申报日期
	private String destinationPort;//	指运港(装货港)
	private String trafName;//运输工具名称
	private String voyageNO;//运输工具航次(班)号
	private String trafMode;//运输方式代码
	private String tradeCO;//	经营单位编号
	private String tradeName;//	经营单位名称
	private String districtCode;//	货主单位地区代码
	private String ownerCode;//货主单位代码
	private String ownerName;//货主单位名称
	private String agentType;//	申报单位类别
	private String agentCode;//	申报单位代码
	private String agentName;//	申报单位名称
	private String contrNO;//	合同号
	private String billNO;//	总运单号
	private String assBillNO;//	分运单号
	private String tradeCountry;//	贸易国别（起/抵运地）
	private String tradeMode;//	监管方式
	private String cutMode;//	征免性质分类
	private String transMode;//	成交方式
	private String feeMark;//	运费标记
	private String feeCurr;//	运费币制
	private String feeRate;//	运费／率
	private String insurMark;//	保险费标记
	private String insurCurr;//	保险费币制
	private String insurRate;//	保险费／率
	private String otherMark;//	杂费标记
	private String otherCurr;//	杂费币制
	private String otherRate;//	杂费／率
	private String packNO;//	件数
	private String grossWT;//	毛重
	private String netWT;//	净重
	private String wrapType;//	包装种类
	private String notes;//	备注
	private String declPort;//	申报口岸代码
	private String coOwner;//	经营单位性质
	
	//缺失属性
	private String mnlJgfFlag;
	private String serviceRate;
	private String serviceFee;
	//缺失属性结束
	
	private String relativeId;//	关联编号字段（转出的手册、转入、转出的报关单）
	
	//缺失属性
	private String typistNo;
	//缺失属性结束
	
	private String inputNO;//	录入人
	private String inputCompanyCO;//	录入单位代码
	private String inputCompanyName;//	录入单位名称
	
	//缺失属性
	private String pDate;
	//缺失属性结束
	
	private String declareNO;//	报关员代码
	private String customsField;//	码头/货场代码（为物流监控备用）
	
	//缺失属性
	private String specialFlag;
	//缺失属性结束
	
	private String kjId;//KJ编号
	private String sendName;//	发件人
	private String receiveName;//	收件人
	private String sendCountry;//	发件人国别
	private String sendCity;//	发件人城市
	private String sendId;//	收发件人证件号
	private String totalValue;//	价值
	private String currCode;//	币制

	//缺失属性
	private String receiveDate;
	private String channelEr;
	//缺失属性结束
	
	private String mainGName;//	主要货物名称
	private String entryType;//	报关类别
	private String sendIdType;//	收发件人证件类型
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getPreEntryId() {
		return preEntryId;
	}
	public void setPreEntryId(String preEntryId) {
		this.preEntryId = preEntryId;
	}
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	public String getI_E_Flag() {
		return i_E_Flag;
	}
	public void setI_E_Flag(String i_E_Flag) {
		this.i_E_Flag = i_E_Flag;
	}
	public String getI_E_Port() {
		return i_E_Port;
	}
	public void setI_E_Port(String i_E_Port) {
		this.i_E_Port = i_E_Port;
	}
	public String getI_E_Date() {
		return i_E_Date;
	}
	public void setI_E_Date(String i_E_Date) {
		this.i_E_Date = i_E_Date;
	}
	public String getD_Date() {
		return d_Date;
	}
	public void setD_Date(String d_Date) {
		this.d_Date = d_Date;
	}
	public String getDestinationPort() {
		return destinationPort;
	}
	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}
	public String getTrafName() {
		return trafName;
	}
	public void setTrafName(String trafName) {
		this.trafName = trafName;
	}
	public String getVoyageNO() {
		return voyageNO;
	}
	public void setVoyageNO(String voyageNO) {
		this.voyageNO = voyageNO;
	}
	public String getTrafMode() {
		return trafMode;
	}
	public void setTrafMode(String trafMode) {
		this.trafMode = trafMode;
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
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getOwnerCode() {
		return ownerCode;
	}
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getContrNO() {
		return contrNO;
	}
	public void setContrNO(String contrNO) {
		this.contrNO = contrNO;
	}
	public String getBillNO() {
		return billNO;
	}
	public void setBillNO(String billNO) {
		this.billNO = billNO;
	}
	public String getAssBillNO() {
		return assBillNO;
	}
	public void setAssBillNO(String assBillNO) {
		this.assBillNO = assBillNO;
	}
	public String getTradeCountry() {
		return tradeCountry;
	}
	public void setTradeCountry(String tradeCountry) {
		this.tradeCountry = tradeCountry;
	}
	public String getTradeMode() {
		return tradeMode;
	}
	public void setTradeMode(String tradeMode) {
		this.tradeMode = tradeMode;
	}
	public String getCutMode() {
		return cutMode;
	}
	public void setCutMode(String cutMode) {
		this.cutMode = cutMode;
	}
	public String getTransMode() {
		return transMode;
	}
	public void setTransMode(String transMode) {
		this.transMode = transMode;
	}
	public String getFeeMark() {
		return feeMark;
	}
	public void setFeeMark(String feeMark) {
		this.feeMark = feeMark;
	}
	public String getFeeCurr() {
		return feeCurr;
	}
	public void setFeeCurr(String feeCurr) {
		this.feeCurr = feeCurr;
	}
	public String getFeeRate() {
		return feeRate;
	}
	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
	}
	public String getInsurMark() {
		return insurMark;
	}
	public void setInsurMark(String insurMark) {
		this.insurMark = insurMark;
	}
	public String getInsurCurr() {
		return insurCurr;
	}
	public void setInsurCurr(String insurCurr) {
		this.insurCurr = insurCurr;
	}
	public String getInsurRate() {
		return insurRate;
	}
	public void setInsurRate(String insurRate) {
		this.insurRate = insurRate;
	}
	public String getOtherMark() {
		return otherMark;
	}
	public void setOtherMark(String otherMark) {
		this.otherMark = otherMark;
	}
	public String getOtherCurr() {
		return otherCurr;
	}
	public void setOtherCurr(String otherCurr) {
		this.otherCurr = otherCurr;
	}
	public String getOtherRate() {
		return otherRate;
	}
	public void setOtherRate(String otherRate) {
		this.otherRate = otherRate;
	}
	public String getPackNO() {
		return packNO;
	}
	public void setPackNO(String packNO) {
		this.packNO = packNO;
	}
	public String getGrossWT() {
		return grossWT;
	}
	public void setGrossWT(String grossWT) {
		this.grossWT = grossWT;
	}
	public String getNetWT() {
		return netWT;
	}
	public void setNetWT(String netWT) {
		this.netWT = netWT;
	}
	public String getWrapType() {
		return wrapType;
	}
	public void setWrapType(String wrapType) {
		this.wrapType = wrapType;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDeclPort() {
		return declPort;
	}
	public void setDeclPort(String declPort) {
		this.declPort = declPort;
	}
	public String getCoOwner() {
		return coOwner;
	}
	public void setCoOwner(String coOwner) {
		this.coOwner = coOwner;
	}
	public String getMnlJgfFlag() {
		return mnlJgfFlag;
	}
	public void setMnlJgfFlag(String mnlJgfFlag) {
		this.mnlJgfFlag = mnlJgfFlag;
	}
	public String getServiceRate() {
		return serviceRate;
	}
	public void setServiceRate(String serviceRate) {
		this.serviceRate = serviceRate;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getRelativeId() {
		return relativeId;
	}
	public void setRelativeId(String relativeId) {
		this.relativeId = relativeId;
	}
	public String getTypistNo() {
		return typistNo;
	}
	public void setTypistNo(String typistNo) {
		this.typistNo = typistNo;
	}
	public String getInputNO() {
		return inputNO;
	}
	public void setInputNO(String inputNO) {
		this.inputNO = inputNO;
	}
	public String getInputCompanyCO() {
		return inputCompanyCO;
	}
	public void setInputCompanyCO(String inputCompanyCO) {
		this.inputCompanyCO = inputCompanyCO;
	}
	public String getInputCompanyName() {
		return inputCompanyName;
	}
	public void setInputCompanyName(String inputCompanyName) {
		this.inputCompanyName = inputCompanyName;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public String getDeclareNO() {
		return declareNO;
	}
	public void setDeclareNO(String declareNO) {
		this.declareNO = declareNO;
	}
	public String getCustomsField() {
		return customsField;
	}
	public void setCustomsField(String customsField) {
		this.customsField = customsField;
	}
	public String getSpecialFlag() {
		return specialFlag;
	}
	public void setSpecialFlag(String specialFlag) {
		this.specialFlag = specialFlag;
	}
	public String getKjId() {
		return kjId;
	}
	public void setKjId(String kjId) {
		this.kjId = kjId;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getSendCountry() {
		return sendCountry;
	}
	public void setSendCountry(String sendCountry) {
		this.sendCountry = sendCountry;
	}
	public String getSendCity() {
		return sendCity;
	}
	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}
	public String getSendId() {
		return sendId;
	}
	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	public String getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}
	public String getChannelEr() {
		return channelEr;
	}
	public void setChannelEr(String channelEr) {
		this.channelEr = channelEr;
	}
	public String getMainGName() {
		return mainGName;
	}
	public void setMainGName(String mainGName) {
		this.mainGName = mainGName;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getSendIdType() {
		return sendIdType;
	}
	public void setSendIdType(String sendIdType) {
		this.sendIdType = sendIdType;
	}
	
	//缺失字段
	/**
	 * MnlJgfFlag
	 * ServiceFee
	 * TypistNo
	 * PDate
	 * SpecialFlag
	 * ReceiveDate
	 * ChannelEr
	 */
	
	
}
