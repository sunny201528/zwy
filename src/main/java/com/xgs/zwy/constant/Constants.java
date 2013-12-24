package com.xgs.zwy.constant;

import java.util.LinkedHashMap;
import java.util.Map;

public class Constants {
public static Map<String, String> TRAFMODE = new LinkedHashMap<String, String>();
static{
	/**
	0	非保税区
	1	监管仓库
	2	江海运输
	3	铁路运输
	4	汽车运输
	5	航空运输
	6	邮件运输
	7	保税区
	8	保税仓库
	9	其它运输
	A	全部运输
	H	边境特殊
	W	物流中心
	X	物流园区
	Y	保税港区
	Z	出口加工
	*/
//		TRAFMODE.put("0","非保税区");
//	    TRAFMODE.put("1","监管仓库");
//	    TRAFMODE.put("2","江海运输");
//		TRAFMODE.put("3","铁路运输");
//		TRAFMODE.put("4","汽车运输");
		TRAFMODE.put("5","航空运输");
//		TRAFMODE.put("6","邮递运输");
//		TRAFMODE.put("7","保税区");
//		TRAFMODE.put("8","保税仓库");
//		TRAFMODE.put("9","其他运输");
//		TRAFMODE.put("A","全部运输");
//		TRAFMODE.put("H","边境特殊");
//		TRAFMODE.put("W","物流中心");
//		TRAFMODE.put("X","物流园区");
//		TRAFMODE.put("Y","保税港区");
//		TRAFMODE.put("Z","出口加工");
	}
public static Map<String, String> I_E_FLAG = new LinkedHashMap<String, String>();
static{
	I_E_FLAG.put("I","进口");
	I_E_FLAG.put("E","出口");
}
public static Map<String, String> COUNTRY = new LinkedHashMap<String, String>();
static{
	COUNTRY.put("阿富汗","101");	
	COUNTRY.put("巴林","102");
	COUNTRY.put("孟加拉国","103");
	COUNTRY.put("不丹","104");
	COUNTRY.put("文莱","105");	
	COUNTRY.put("缅甸","106");
	COUNTRY.put("柬埔寨","107");
	COUNTRY.put("塞浦路斯","108");
	COUNTRY.put("朝鲜","109");	
	COUNTRY.put("中国香港","110");
	COUNTRY.put("香港","110");
	COUNTRY.put("印度","111");	
	COUNTRY.put("印度尼西亚","112");
	COUNTRY.put("伊朗","113");
	COUNTRY.put("伊拉克","114");
	COUNTRY.put("以色列","115");
	COUNTRY.put("日本","116");
	COUNTRY.put("约旦","117");	
	COUNTRY.put("科威特","118");
	COUNTRY.put("老挝","119");	
	COUNTRY.put("黎巴嫩","120");
	COUNTRY.put("中国澳门","121");	
	COUNTRY.put("澳门","121");	
	COUNTRY.put("马来西亚","122");
	COUNTRY.put("马尔代夫","123");	
	COUNTRY.put("蒙古","124");
	COUNTRY.put("尼泊尔","125");	
	COUNTRY.put("阿曼","126");
	COUNTRY.put("巴基斯坦","127");	
	COUNTRY.put("巴勒斯坦","128");
	COUNTRY.put("菲律宾","129");
	COUNTRY.put("卡塔尔","130");
	COUNTRY.put("沙特阿拉伯","131");	
	COUNTRY.put("新加坡","132");
	COUNTRY.put("韩国","133");	
	COUNTRY.put("斯里兰卡","134");
	COUNTRY.put("叙利亚","135");
	COUNTRY.put("泰国","136");
	COUNTRY.put("土耳其","137");	
	COUNTRY.put("阿联酋","138");
	COUNTRY.put("也门共和国","139");	
	COUNTRY.put("越南","141");
	COUNTRY.put("中国","142");
	COUNTRY.put("台澎金马关税区","143");
	COUNTRY.put("台湾","143");
	COUNTRY.put("东帝汶","144");	
	COUNTRY.put("哈萨克斯坦","145");
	COUNTRY.put("吉尔吉斯斯坦","146");	
	COUNTRY.put("塔吉克斯坦","147");
	COUNTRY.put("土库曼斯坦","148");	
	COUNTRY.put("乌兹别克斯坦","149");
	COUNTRY.put("亚洲其他国家(地区)","199");	
	COUNTRY.put("非洲","200");
	COUNTRY.put("阿尔及利亚","201");	
	COUNTRY.put("安哥拉","202");
	COUNTRY.put("贝宁","203");	
	COUNTRY.put("博茨瓦那","204");
	COUNTRY.put("布隆迪","205");	
	COUNTRY.put("喀麦隆","206");
	COUNTRY.put("加那利群岛","207");	
	COUNTRY.put("佛得角","208");
	COUNTRY.put("中非共和国","209");	
	COUNTRY.put("塞卜泰","210");
	COUNTRY.put("乍得","211");	
	COUNTRY.put("科摩罗","212");
	COUNTRY.put("刚果","213");	
	COUNTRY.put("吉布提","214");
	COUNTRY.put("埃及","215");	
	COUNTRY.put("赤道几内亚","216");
	COUNTRY.put("埃塞俄比亚","217");	
	COUNTRY.put("加蓬","218");
	COUNTRY.put("冈比亚","219");	
	COUNTRY.put("加纳","220");
	COUNTRY.put("几内亚","221");	
	COUNTRY.put("几内亚(比绍)","222");
	COUNTRY.put("科特迪瓦","223");	
	COUNTRY.put("肯尼亚","224");
	COUNTRY.put("利比里亚","225");	
	COUNTRY.put("利比亚","226");
	COUNTRY.put("马达加斯加","227");	
	COUNTRY.put("马拉维","228");
	COUNTRY.put("马里","229");	
	COUNTRY.put("毛里塔尼亚","230");
	COUNTRY.put("毛里求斯","231");	
	COUNTRY.put("摩洛哥","232");
	COUNTRY.put("莫桑比克","233");	
	COUNTRY.put("纳米比亚","234");
	COUNTRY.put("尼日尔","235");	
	COUNTRY.put("尼日利亚","236");
	COUNTRY.put("留尼汪","237");	
	COUNTRY.put("卢旺达","238");
	COUNTRY.put("圣多美和普林西比","239");	
	COUNTRY.put("塞内加尔","240");
	COUNTRY.put("塞舌尔","241");	
	COUNTRY.put("塞拉利昂","242");
	COUNTRY.put("索马里","243");	
	COUNTRY.put("南非","244");
	COUNTRY.put("西撒哈拉","245");	
	COUNTRY.put("苏丹","246");
	COUNTRY.put("坦桑尼亚","247");	
	COUNTRY.put("多哥","248");
	COUNTRY.put("突尼斯","249");	
	COUNTRY.put("乌干达","250");
	COUNTRY.put("布基纳法索","251");	
	COUNTRY.put("民主刚果","252");
	COUNTRY.put("赞比亚","253");	
	COUNTRY.put("津巴布韦","254");
	COUNTRY.put("莱索托","255");	
	COUNTRY.put("梅利利亚","256");
	COUNTRY.put("斯威士兰","257");	
	COUNTRY.put("厄立特里亚","258");
	COUNTRY.put("马约特岛","259");	
	COUNTRY.put("非洲其他国家(地区)","299");
	COUNTRY.put("欧洲","300");	
	COUNTRY.put("比利时","301");
	COUNTRY.put("丹麦","302");	
	COUNTRY.put("英国","303");
	COUNTRY.put("德国","304");	
	COUNTRY.put("法国","305");
	COUNTRY.put("爱尔兰","306");	
	COUNTRY.put("意大利","307");
	COUNTRY.put("卢森堡","308");	
	COUNTRY.put("荷兰","309");
	COUNTRY.put("希腊","310");	
	COUNTRY.put("葡萄牙","311");
	COUNTRY.put("西班牙","312");	
	COUNTRY.put("阿尔巴尼亚","313");
	COUNTRY.put("安道尔","314");	
	COUNTRY.put("奥地利","315");
	COUNTRY.put("保加利亚","316");	
	COUNTRY.put("芬兰","318");
	COUNTRY.put("直布罗陀","320");	
	COUNTRY.put("匈牙利","321");
	COUNTRY.put("冰岛","322");	
	COUNTRY.put("列支敦士登","323");
	COUNTRY.put("马耳他","324");	
	COUNTRY.put("摩纳哥","325");
	COUNTRY.put("挪威","326");	
	COUNTRY.put("波兰","327");
	COUNTRY.put("罗马尼亚","328");	
	COUNTRY.put("圣马力诺","329");
	COUNTRY.put("瑞典","330");
	COUNTRY.put("瑞士","331");
	COUNTRY.put("爱沙尼亚","334");	
	COUNTRY.put("拉脱维亚","335");
	COUNTRY.put("立陶宛","336");	
	COUNTRY.put("格鲁吉亚","337");
	COUNTRY.put("亚美尼亚","338");	
	COUNTRY.put("阿塞拜疆","339");
	COUNTRY.put("白俄罗斯","340");	
	COUNTRY.put("哈萨克斯坦","341");
	COUNTRY.put("吉尔吉斯斯坦","342");	
	COUNTRY.put("摩尔多瓦","343");
	COUNTRY.put("俄罗斯联邦","344");	
	COUNTRY.put("塔吉克斯坦","345");
	COUNTRY.put("土库曼斯坦","346");	
	COUNTRY.put("乌克兰","347");
	COUNTRY.put("乌兹别克斯坦","348");	
	COUNTRY.put("南斯拉夫","349");
	COUNTRY.put("斯洛文尼亚","350");	
	COUNTRY.put("克罗地亚","351");
	COUNTRY.put("捷克共和国","352");	
	COUNTRY.put("斯洛伐克","353");
	COUNTRY.put("马其顿","354");	
	COUNTRY.put("波斯尼亚-黑塞哥维那共和","355");
	COUNTRY.put("梵蒂冈城国","356");	
	COUNTRY.put("欧洲其他国家(地区)","399");
	COUNTRY.put("拉丁美洲","400");	
	COUNTRY.put("安提瓜和巴布达","401");
	COUNTRY.put("阿根廷","402");	
	COUNTRY.put("阿鲁巴岛","403");
	COUNTRY.put("巴哈马","404");	
	COUNTRY.put("巴巴多斯","405");
	COUNTRY.put("伯利兹","406");	
	COUNTRY.put("玻利维亚","408");
	COUNTRY.put("博内尔","409");	
	COUNTRY.put("巴西","410");
	COUNTRY.put("开曼群岛","411");	
	COUNTRY.put("智利","412");
	COUNTRY.put("哥伦比亚","413");	
	COUNTRY.put("多米尼亚共和国","414");
	COUNTRY.put("哥斯达黎加","415");	
	COUNTRY.put("古巴","416");
	COUNTRY.put("库腊索岛","417");	
	COUNTRY.put("多米尼加共和国","418");
	COUNTRY.put("厄瓜多尔","419");	
	COUNTRY.put("法属圭亚那","420");
	COUNTRY.put("格林纳达","421");	
	COUNTRY.put("瓜德罗普","422");
	COUNTRY.put("危地马拉","423");	
	COUNTRY.put("圭亚那","424");
	COUNTRY.put("海地","425");	
	COUNTRY.put("洪都拉斯","426");
	COUNTRY.put("牙买加","427");	
	COUNTRY.put("马提尼克","428");
	COUNTRY.put("墨西哥","429");	
	COUNTRY.put("蒙特塞拉特","430");
	COUNTRY.put("尼加拉瓜","431");
	COUNTRY.put("巴拿马","432");
	COUNTRY.put("巴拉圭","433");	
	COUNTRY.put("秘鲁","434");
	COUNTRY.put("波多黎各","435");	
	COUNTRY.put("萨巴","436");
	COUNTRY.put("圣卢西亚","437");	
	COUNTRY.put("圣马丁岛","438");
	COUNTRY.put("圣文森特和格林纳丁斯","439");	
	COUNTRY.put("萨尔瓦多","440");
	COUNTRY.put("苏里南","441");	
	COUNTRY.put("特立尼达和多巴哥","442");
	COUNTRY.put("特克斯和凯科斯群岛","443");	
	COUNTRY.put("乌拉圭","444");
	COUNTRY.put("委内瑞拉","445");	
	COUNTRY.put("英属维尔京群岛","446");
	COUNTRY.put("圣其茨-尼维斯","447");	
	COUNTRY.put("圣皮埃尔和密克隆","448");
	COUNTRY.put("荷属安地列斯群岛","449");	
	COUNTRY.put("拉丁美洲其他国家(地区)","499");
	COUNTRY.put("北美洲","500");	
	COUNTRY.put("加拿大","501");
	COUNTRY.put("美国","502");	
	COUNTRY.put("格陵兰","503");
	COUNTRY.put("百慕大","504");	
	COUNTRY.put("北美洲其他国家(地区)","599");
	COUNTRY.put("大洋洲","600");	
	COUNTRY.put("澳大利亚","601");
	COUNTRY.put("库克群岛","602");	
	COUNTRY.put("斐济","603");
	COUNTRY.put("盖比群岛","604");	
	COUNTRY.put("马克萨斯群岛","605");
	COUNTRY.put("瑙鲁","606");	
	COUNTRY.put("新喀里多尼亚","607");
	COUNTRY.put("瓦努阿图","608");	
	COUNTRY.put("新西兰","609");
	COUNTRY.put("诺福克岛","610");	
	COUNTRY.put("巴布亚新几内亚","611");
	COUNTRY.put("社会群岛","612");	
	COUNTRY.put("所罗门群岛","613");
	COUNTRY.put("汤加","614");
	COUNTRY.put("土阿莫土群岛","615");
	COUNTRY.put("土布艾群岛","616");	
	COUNTRY.put("萨摩亚","617");
	COUNTRY.put("基里巴斯","618");	
	COUNTRY.put("图瓦卢","619");
	COUNTRY.put("密克罗尼西亚联邦","620");	
	COUNTRY.put("马绍尔群岛","621");
	COUNTRY.put("帕劳共和国","622");	
	COUNTRY.put("法属波利尼西亚","623");
	COUNTRY.put("新喀里多尼亚","624");
	COUNTRY.put("瓦利斯和浮图纳","625");
	COUNTRY.put("大洋洲其他国家(地区)","699");	
	COUNTRY.put("国(地)别不详的","701");
	COUNTRY.put("联合国及机构和国际组织","702");	
	COUNTRY.put("中性包装原产国别","999");
	COUNTRY.put("亚洲","100");	
}

/**报关类别*/
public static Map<String, String> ENTRY_TYPE = new LinkedHashMap<String, String>();
static{
	/**
     *1     3010
	 *2,3   3039
	*/
	ENTRY_TYPE.put("1","3010");
	ENTRY_TYPE.put("2","3039");
	ENTRY_TYPE.put("3","3039");
	}
}
