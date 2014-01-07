package com.xgs.zwy.domain;


/**
 * 系统设置
 * @author n-194
 *
 */
public class SystemSetting {
	/**
	 * 文件的输出目录
	 */
	private String outPath;
	/**
	 * 文件的输入目录
	 */
//	private String inPath;
	public String getOutPath() {
		return outPath;
	}
	public void setOutPath(String outPath) {
		this.outPath = outPath;
	}
//	public String getInPath() {
//		return inPath;
//	}
//	public void setInPath(String inPath) {
//		this.inPath = inPath;
//	}
	public SystemSetting( String outPath) {
		super();
//		this.inPath = inPath;
		this.outPath = outPath;
	}
	public SystemSetting() {
	}
	
}
