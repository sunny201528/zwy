package com.xgs.zwy.vo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.xgs.zwy.domain.SystemSetting;

public class SystemSettingValidate {

	public static List<String> validateSystemSetting(SystemSetting systemSetting){
		List<String> list = new ArrayList<String>();
		if(systemSetting==null){
			list.add("没有进行全局设置！请设置后保存！");
			return list;
		}
//		String inPath =systemSetting.getInPath();
//		if(inPath==null||inPath.trim().trim().equals("")){
//			list.add("文件的输入路径没有配置！请设置！");
//			return list;
//		}
	String outPath = systemSetting.getOutPath();
	if(outPath==null||outPath.trim().trim().equals("")){
			list.add("文件的输出路径没有配置！请设置！");
			return list;
		}
//	isOk(inPath, list, true);
	isOk(outPath, list, false);
	
	return list;
	
	}
	
	private static boolean isOk(String path,List<String> list,boolean isInPath){
		File file = new File(path);
		
		if(file.exists()){
			File[] fileList = file.listFiles();
			if(isInPath){
				if(fileList!=null&&fileList.length==1){
					File tmp =fileList[0]; 
					if(tmp.isFile()&&(tmp.getName().endsWith("xlsx")||tmp.getName().endsWith("xls"))){
						return true;
					}
					
				}
			}else{
				if(fileList==null||fileList.length==0){
					return true;
				}
			}
			
		}else{
			if(!isInPath){
				return true;
			}
		}
		
		if(isInPath){
			list.add("输入路劲下只能有一个电子表格的文件");
		}else{
			list.add("输出目录必须为空,请清空输出目录！");
		}
			
		return false;
	}
public static String getInputPath(SystemSetting systemSetting){
	List< String> list = validateSystemSetting(systemSetting);
//	if(list.size()==0){
//		return new File(systemSetting.getInPath()).listFiles()[0].getAbsolutePath();
//	}
	return "";
}
}
