package com.xgs.zwy.base;

import com.xgs.zwy.domain.SystemSetting;

public class ThreadLocalVariable {

private static SystemSetting systemSetting = null;

public static void cleanThreadLocal(){
	systemSetting=null;
}

public static void setSystemSetting(SystemSetting setting){
	systemSetting=setting;
}

public static SystemSetting getSystemSetting(){
	return systemSetting;
}

//}
}
