package com.xgs.zwy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 系统设置
 * @author n-194
 *
 */
@Entity(name="t_SystemSetting")
public class SystemSetting {
	public static final  int ID =1;

	@Id
	private int  id=ID;
	/**
	 * 文件的输出目录
	 */
	private String outPath;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOutPath() {
		return outPath;
	}
	public void setOutPath(String outPath) {
		this.outPath = outPath;
	}
	
	
}
